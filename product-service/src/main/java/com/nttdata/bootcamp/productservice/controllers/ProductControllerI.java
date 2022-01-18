package com.nttdata.bootcamp.productservice.controllers;

import com.nttdata.bootcamp.productservice.dtos.ProductDto;

/** Interfaz del controlador Rest de Product */
public interface ProductControllerI {

	/** Muestra la información de Product */
	public ProductDto showProductInfo();

}
