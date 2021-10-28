package com.apirestdocker.neoapidocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan("com.apirestdocker.neoapidocker.model")
@ComponentScan("com.apirestdocker.neoapidocker.controller")
@EnableSwagger2
public class NeoApiDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeoApiDockerApplication.class, args);
	}

}
