package com.zhao.boot;

import com.zhao.boot.bean.Cat;
import com.zhao.boot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private ApplicationContext context;

	@Value("${a.personName}")
    private String pName;
    @Value("${person.intValue}")
    private int intValue;

    @Value("${jdbc.username}")
    private String u;

	@Test
	public void contextLoads() {
		System.out.println(person);
		System.out.println(context.getBean(Cat.class)==person.getCat());
		System.out.println(pName);
        System.out.println(u);
        System.out.println(intValue);
    }

}