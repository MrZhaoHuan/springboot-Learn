package com.zhao.springAnnotation.test;

import com.zhao.bean.UserDao;
import com.zhao.bean.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 9:41
 * @描述  测试autowrired
 */
public class TestAutoInject {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.zhao.springAnnotation.annotation.TestAutoInject.class);
    @Test
    public void t1(){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String beanName:beanDefinitionNames){
            System.out.println(beanName);
        }

        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserDao.class));
    }
}