package com.zhao.springAnnotation.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 14:21
 * @描述      测试注解配置功能
 */
@SuppressWarnings("all")
public class TestConfiguration {
    AnnotationConfigApplicationContext context;

    @Before
    public void before() {
        context = new AnnotationConfigApplicationContext(com.zhao.springAnnotation.annotation.TestConfiguration.class);
    }

    //通过注解配置，注入bean
    //@Test
    //public void testBeanInject() {
    //    Person person = context.getBean(Person.class);
    //    System.out.println(person);
    //}

    //通过注解扫描，注入bean
    @Test
    public void testComponentScan() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
        System.out.println(context.getBean("bean"));

        //System.out.println("----------bean Info-----");
        //LearnDao person1 = context.getBean(LearnDao.class);
        //LearnDao person2 = context.getBean(LearnDao.class);
        //System.out.println(person1==person2);
    }
}