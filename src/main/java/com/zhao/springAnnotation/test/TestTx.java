package com.zhao.springAnnotation.test;

import com.zhao.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 20:27
 * @描述      测试申明式事务
 */
public class TestTx {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.zhao.springAnnotation.annotation.TestTx.class);

    @Test
    public void t1() {
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);

        userService.saveUser();
    }
}