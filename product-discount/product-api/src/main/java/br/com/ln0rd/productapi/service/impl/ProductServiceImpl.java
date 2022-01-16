package br.com.ln0rd.productapi.service.impl;

import br.com.ln0rd.productapi.entity.Product;
import br.com.ln0rd.productapi.grpc.ProductDiscountGrpcClient;
import br.com.ln0rd.productapi.model.DiscountModel;
import br.com.ln0rd.productapi.model.ProductWithDiscountModel;
import br.com.ln0rd.productapi.repository.ProductRespository;
import br.com.ln0rd.productapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRespository productRespository;

    @Autowired
    ProductDiscountGrpcClient productDiscountGrpcClient;

    @Override
    public List<ProductWithDiscountModel> getProductsWithDiscount(int userId) {

        List<ProductWithDiscountModel> productWithDiscountModels = new ArrayList();

        try {
            List<Product> productEntityList = productRespository.findAll();

            for (Product productEntity : productEntityList) {
                DiscountModel discountModel = productDiscountGrpcClient.getProductDiscount(productEntity.getPriceInCents(), userId);
                productWithDiscountModels.add( new ProductWithDiscountModel(
                        productEntity.getPriceInCents(),
                        productEntity.getTitle(),
                        productEntity.getDescription(),
                        discountModel));
            }

            return productWithDiscountModels;
        } catch(Exception exception) {
            throw exception;
        }
    }
}
