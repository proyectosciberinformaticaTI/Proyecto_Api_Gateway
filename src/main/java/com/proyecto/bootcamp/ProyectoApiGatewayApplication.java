package com.proyecto.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ProyectoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApiGatewayApplication.class, args);
	}

}
