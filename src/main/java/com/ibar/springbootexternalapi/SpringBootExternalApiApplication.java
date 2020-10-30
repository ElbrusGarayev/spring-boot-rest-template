package com.ibar.springbootexternalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringBootExternalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExternalApiApplication.class, args);
	}

}
