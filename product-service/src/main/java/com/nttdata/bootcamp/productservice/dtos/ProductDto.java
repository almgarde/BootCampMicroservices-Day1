package com.nttdata.bootcamp.productservice.dtos;

/**
 * DTO de product
 * 
 * @author agadelao
 *
 */
public class ProductDto {

	/** Nombre del producto */
	private String productName;

	/** Puerto de la aplicación */
	private String port;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
