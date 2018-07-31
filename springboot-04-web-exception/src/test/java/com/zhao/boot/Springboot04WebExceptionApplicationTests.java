package com.zhao.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.HandlerExceptionResolver;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04WebExceptionApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	public void contextLoads() {
		Map<String, HandlerExceptionResolver> beansOfType = context.getBeansOfType(HandlerExceptionResolver.class);

		for(String key: beansOfType.keySet()){
			System.out.println(key);
			System.out.println(beansOfType.get(key));
			System.out.println("------------------");
		}
	}

}