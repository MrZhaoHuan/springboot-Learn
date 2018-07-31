package com.zhao.boot;

import com.zhao.ZhaoProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhaohuanSpringBootStarterTestApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	public void contextLoads() {
		ZhaoProperties zhaoProperties = context.getBean(ZhaoProperties.class);
		System.out.println(zhaoProperties.getAge());
		System.out.println(zhaoProperties.getName());
	}

}