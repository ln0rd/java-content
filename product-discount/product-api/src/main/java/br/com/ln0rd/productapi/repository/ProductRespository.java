package br.com.ln0rd.productapi.repository;

import br.com.ln0rd.productapi.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRespository extends CrudRepository<Product, Integer> {

    Product findById(int productId);

    List<Product> findAll();
}
