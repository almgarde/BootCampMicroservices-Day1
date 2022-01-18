package com.nttdata.bootcamp.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Bootcamp - Microservicios - Taller práctico
 * 
 * Microservicio Products
 * 
 * @author agadelao
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	/** Clase principal */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
