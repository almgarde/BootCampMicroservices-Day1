package com.nttdata.bootcamp.productservice.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.productservice.dtos.ProductDto;

/** Implementación del servicio de información del producto */
@Service
public class ProductServiceImpl implements ProductServiceI {

	/** Nombre del producto */
	@Value("${product.product-name}")
	private String productName;

	/** Puerto del producto */
	@Value("${server.port}")
	private String port;

	/** Devuelve la información del producto */
	@Override
	public ProductDto getProductInfo() {

		final ProductDto productDto = new ProductDto();

		productDto.setProductName(productName);
		productDto.setPort(port);

		return productDto;

	}

}
