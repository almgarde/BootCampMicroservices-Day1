package com.nttdata.bootcamp.productservice.services;

import com.nttdata.bootcamp.productservice.dtos.ProductDto;

/**
 * Interfaz del servicio de información del producto
 * 
 * @author agadelao
 *
 */
public interface ProductServiceI {

	/** Devuelve la información del producto */
	public ProductDto getProductInfo();

}
