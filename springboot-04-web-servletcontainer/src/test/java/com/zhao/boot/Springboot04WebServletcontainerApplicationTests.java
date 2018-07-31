package com.zhao.boot;

import com.zhao.boot.conditional.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04WebServletcontainerApplicationTests {

    @Autowired
    private ApplicationContext context;

   // @Test
    public void contextLoads() {
        Map<String, EmbeddedServletContainerCustomizer> beansOfType = context.getBeansOfType(EmbeddedServletContainerCustomizer.class);
        for (String key : beansOfType.keySet()) {
            System.out.println("------------");
            System.out.println(key);
            System.out.println(beansOfType.get(key));
        }
    }


    @Test
    public void testConditional(){
        //System.out.println(context.getBean(Person.class));
        System.out.println("---------------A-----------\n\n\n");
        System.out.println(context.getBean(A.class));
    }


}
