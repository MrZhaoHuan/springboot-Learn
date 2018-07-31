package com.zhao.springAnnotation.test;

import com.zhao.bean.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 21:27
 * @描述      测试属性赋值
 */
public class TestPropertyValue {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.zhao.springAnnotation.annotation.TestPropertyValue.class);

    @Test
    public void t1(){
        User user = context.getBean(User.class);
        System.out.println(user);
    }

}
