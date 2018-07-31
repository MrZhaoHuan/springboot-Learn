package com.zhao.springAnnotation.annotation;

import com.zhao.springAnnotation.dao.A;
import com.zhao.springAnnotation.dao.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 12:31
 * @描述
 */
@Configuration
public class TestProfile {

    @Bean
    @Profile("getA")
    public A getA() {
        return new A();
    }

    @Bean
    @Profile("b")
    public B getB() {
        return new B();
    }
}