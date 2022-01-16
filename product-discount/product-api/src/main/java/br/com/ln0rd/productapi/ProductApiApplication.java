package br.com.ln0rd.productapi;

import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductApiApplication.class, args);

	}
}
