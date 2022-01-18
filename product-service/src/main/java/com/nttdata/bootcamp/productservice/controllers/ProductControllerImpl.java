package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.dtos.ProductDto;
import com.nttdata.bootcamp.productservice.services.ProductServiceImpl;

/**
 * Impleentación del controlador Rest Product
 * 
 * @author agadelao
 *
 */
@RestController
@RequestMapping("/products")
public class ProductControllerImpl implements ProductControllerI {

	/** Servicio de Products */
	@Autowired
	private ProductServiceImpl productService;

	/** Muestra la información de Product */
	@GetMapping("/info")
	public ProductDto showProductInfo() {

		return productService.getProductInfo();

	}

}
