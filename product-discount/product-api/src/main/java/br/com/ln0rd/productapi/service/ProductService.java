package br.com.ln0rd.productapi.service;

import br.com.ln0rd.productapi.entity.Product;
import br.com.ln0rd.productapi.model.ProductWithDiscountModel;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface ProductService {

    List<ProductWithDiscountModel> getProductsWithDiscount(int userId) throws JsonProcessingException;

}
