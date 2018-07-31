package com.zhao.springAnnotation.test;

import com.zhao.bean.UserDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 13:34
 * @描述  测试aop
 */
public class TestAop {
    AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(com.zhao.springAnnotation.annotation.TestAop.class);
    @Test
    public void t1(){
        UserDao userDao = context.getBean(UserDao.class);
        userDao.calc(9,3);
    }
}