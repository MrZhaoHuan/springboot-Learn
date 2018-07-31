package com.zhao.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@ImportResource("classpath:/beans.xml")
@PropertySource("classpath:/data.properties")
public class Springboot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02ConfigApplication.class, args);
	}
}