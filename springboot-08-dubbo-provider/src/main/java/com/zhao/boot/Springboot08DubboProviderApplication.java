package com.zhao.boot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Springboot08DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot08DubboProviderApplication.class, args);
	}
}
