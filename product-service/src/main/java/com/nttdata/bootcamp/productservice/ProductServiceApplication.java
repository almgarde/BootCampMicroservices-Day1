package com.nttdata.bootcamp.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Bootcamp - Microservicios - Taller práctico
 * 
 * Microservicio Products
 * 
 * @author agadelao
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {

	/**
	 * Clase principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
