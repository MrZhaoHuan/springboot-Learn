package com.zhao.springAnnotation.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 9:39
 * @描述
 */
@Configuration
@ComponentScan(basePackages = {"com.zhao.bean"})
@PropertySource(value = "classpath:resource.properties",encoding = "utf-8")
public class TestAutoInject {

    //@Bean
    //public User user(){
    //    return new User();
    //}

    @Bean
    public int age(){
        return 16;
    }
}