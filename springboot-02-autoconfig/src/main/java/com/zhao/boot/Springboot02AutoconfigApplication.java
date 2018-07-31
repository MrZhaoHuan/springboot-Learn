package com.zhao.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:selfDb.properties")
public class Springboot02AutoconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02AutoconfigApplication.class, args);
	}
}