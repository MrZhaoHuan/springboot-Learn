package com.zhao.springboot10cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboot10CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot10CacheApplication.class, args);
	}
}
