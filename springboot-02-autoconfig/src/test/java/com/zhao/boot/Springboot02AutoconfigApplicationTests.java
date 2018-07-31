package com.zhao.boot;

import com.zhao.test.TestDb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02AutoconfigApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Value("${jdbc.username}")
	private String dbName;

	@Test
	public void contextLoads() {
		System.out.println(context.getBean(TestDb.class));
		System.out.println(dbName);
	}

}