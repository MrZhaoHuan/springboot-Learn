package com.zhao.springAnnotation.test;

import com.zhao.springAnnotation.dao.B;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 12:32
 * @描述  测试不同环境切换
 */
public class TestProfile {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

    @Test
    public void t1() {
        context.getEnvironment().setActiveProfiles("b");
        context.register(com.zhao.springAnnotation.annotation.TestProfile.class);
        context.refresh();
        //System.out.println(context.getBean(A.class));
        System.out.println(context.getBean(B.class));
    }
}