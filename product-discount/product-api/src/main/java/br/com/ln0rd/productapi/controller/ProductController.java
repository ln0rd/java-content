package br.com.ln0rd.productapi.controller;

import br.com.ln0rd.productapi.model.ProductWithDiscountModel;
import br.com.ln0rd.productapi.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @GetMapping
    public ResponseEntity<List<ProductWithDiscountModel>> getProducts(@RequestHeader(value = "X-USER-ID", defaultValue = "0") String userId) {

        List<ProductWithDiscountModel> products = productServiceImpl.getProductsWithDiscount(
                Integer.parseInt(userId));

        return ResponseEntity.ok(products);
    }
}
