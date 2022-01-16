package br.com.ln0rd.productapi.service;

import br.com.ln0rd.productapi.entity.Product;
import br.com.ln0rd.productapi.grpc.ProductDiscountGrpcClient;
import br.com.ln0rd.productapi.model.DiscountModel;
import br.com.ln0rd.productapi.model.ProductWithDiscountModel;
import br.com.ln0rd.productapi.repository.ProductRespository;
import br.com.ln0rd.productapi.service.impl.ProductServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    private static List<Product> products;
    private static ProductWithDiscountModel productWithDiscountModel;
    private static DiscountModel discountModel;

    @Mock
    ProductRespository productRespository;

    @Mock
    ProductDiscountGrpcClient productDiscountGrpcClient;

    @InjectMocks
    ProductServiceImpl productService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        products = createProductList();
    }

    @Test
    public void getProductsWithDiscountWhenPercentageEqualZeroTest() {
        int userId = 1;
        DiscountModel discountModel = createDiscountModel(0, 0);
        ProductWithDiscountModel productWithDiscountModel = createProductWithDiscountModel(0, 0);

        Mockito.when(productRespository.findAll()).thenReturn(products);
        Mockito.when(productDiscountGrpcClient.getProductDiscount(products.get(0).getPriceInCents(), userId)).thenReturn(discountModel);

        List<ProductWithDiscountModel> result = productService.getProductsWithDiscount(userId);

        Assert.assertEquals(result.get(0).getDiscount().getPercentage(), productWithDiscountModel.getDiscount().getPercentage());
        Assert.assertEquals(result.get(0).getDiscount().getValueInCents(), productWithDiscountModel.getDiscount().getValueInCents());
    }

    @Test
    public void getProductsWithDiscountWhenPercentageIsTenTest() {
        int userId = 1;
        DiscountModel discountModel = createDiscountModel(1800, 10);
        ProductWithDiscountModel productWithDiscountModel = createProductWithDiscountModel(1800,10);

        Mockito.when(productRespository.findAll()).thenReturn(products);
        Mockito.when(productDiscountGrpcClient.getProductDiscount(products.get(0).getPriceInCents(), userId)).thenReturn(discountModel);

        List<ProductWithDiscountModel> result = productService.getProductsWithDiscount(userId);

        Assert.assertEquals(result.get(0).getDiscount().getPercentage(), productWithDiscountModel.getDiscount().getPercentage());
        Assert.assertEquals(result.get(0).getDiscount().getValueInCents(), productWithDiscountModel.getDiscount().getValueInCents());
    }

    public static List<Product> createProductList() {
        List<Product> productList = new ArrayList();
        productList.add(new Product(2000, "Product Test", "Product created by amazing client"));
        productList.add(new Product(4000, "Product Test 2", "Product created by amazing client 2"));

        return productList;
    }

    public static ProductWithDiscountModel createProductWithDiscountModel(int valueInCents, int percentage) {
        return new ProductWithDiscountModel(
                2000,
                "Product Test",
                "Product created by amazing client",
                new DiscountModel(valueInCents, percentage));
    }

    public static DiscountModel createDiscountModel(int valueInCents, int percentage) {
        return new DiscountModel(
                valueInCents,
                percentage);
    }
}
