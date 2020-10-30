package com.ibar.springbootexternalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootExternalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExternalApiApplication.class, args);
	}

}
