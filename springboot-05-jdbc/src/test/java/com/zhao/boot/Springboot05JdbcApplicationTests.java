package com.zhao.boot;

import com.zhao.boot.transaction.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot05JdbcApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UserService userService;

	//@Test
	public void t1(){
		System.out.println(dataSource);
	}

	//@Test
	public void testQuery(){
		System.out.println(dataSource);

		Map<String, Object> objectMap = jdbcTemplate.queryForMap("select * from user");
		System.out.println(objectMap);
	}

	@Test
	public void testTx(){
		userService.insertUser();
	}
}
