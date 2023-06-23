package com.microservice.software;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info =
@Info(title = "software API", version = "1.0", description = "Documentation Employee API v1.0")
)
public class SoftwareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareServiceApplication.class, args);
	}

}
