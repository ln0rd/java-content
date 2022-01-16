package br.com.ln0rd.productapi.grpc;

import br.com.ln0rd.productapi.model.DiscountModel;
import com.google.gson.Gson;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class ProductDiscountGrpcClient {

    private ManagedChannel channel;
    private ProductInfo.ProductDiscountRequest productDiscountRequest;
    private ProductInfo.ProductDiscountResponse response;
    private ProductDiscountGrpc.ProductDiscountBlockingStub productStub;

    public DiscountModel getProductDiscount(int productPriceInCents, int userId) {

        channel = ManagedChannelBuilder.forAddress("discount-service", 8081).usePlaintext().build();

        productStub = ProductDiscountGrpc.newBlockingStub(channel);
        productDiscountRequest = ProductInfo.ProductDiscountRequest
                .newBuilder()
                .setProductPriceInCents(productPriceInCents)
                .setUserId(userId).build();

        try {
            this.response = productStub.getProductDiscount(productDiscountRequest);
        } catch (Exception exception) {
            System.out.println("Error in establish communicate with grpc server");
        }

        ConnectivityState grpcServerStatus = channel.getState(true);

        if (grpcServerStatus == ConnectivityState.TRANSIENT_FAILURE) {
            return new DiscountModel(0,0);
        }

        try {
            JSONObject jsonObject = new JSONObject(this.response.getMessage());
            clearResponse(this.response);
            return new DiscountModel(
                    Integer.parseInt(jsonObject.get("valueInCents").toString()),
                    Integer.parseInt(jsonObject.get("percentage").toString())
            );
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception ex) {
           System.out.println("Error with message from server ProductDiscountGrpcClient");
        }

        return new DiscountModel(0,0);
    }

    private void clearResponse(ProductInfo.ProductDiscountResponse response) {
        this.response = response.toBuilder().clearMessage().build();
    }

}
