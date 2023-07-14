package com.microservice.software;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class SoftwareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareServiceApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		Contact contact = new Contact("name", "http://tritronik.com", "risna.hendayana@tritronik.com");
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		addAuthDocket(docket);
		
		return docket;
	}
	
	public void addAuthDocket(Docket docket) {
		ParameterBuilder aParameterBuilder = new ParameterBuilder();

		Parameter authHeaderParameter = aParameterBuilder
				.name("authorization") 
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.defaultValue("")
				.required(true) 
				.build();

		List<Parameter> params = new ArrayList<Parameter>();
		params.add(authHeaderParameter);
		
		docket.globalOperationParameters(params);
	}

}
