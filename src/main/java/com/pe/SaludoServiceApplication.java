package com.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SaludoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaludoServiceApplication.class, args);
		System.out.println("Iniciado: Saludo Service");
	}

}
