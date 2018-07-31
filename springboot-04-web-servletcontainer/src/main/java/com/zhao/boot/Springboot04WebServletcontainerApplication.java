package com.zhao.boot;

import com.zhao.boot.conditional.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot04WebServletcontainerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Springboot04WebServletcontainerApplication.class, args);
	}

	@Autowired
	private A a;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------aaaaaaaa-------\n\n\n");
		System.out.println(a);
	}
}