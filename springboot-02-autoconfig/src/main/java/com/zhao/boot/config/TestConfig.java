package com.zhao.boot.config;

import org.springframework.context.annotation.Configuration;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-28 13:12
 * @描述
 **/
@Configuration
public class TestConfig {
    public TestConfig(){
        System.out.println(getClass().getClassLoader());
        System.out.println(Thread.currentThread().getContextClassLoader ().getResource("").getPath());
        System.out.println("---------------------------------------------------------");
    }

    //@Bean
    //public TestDb db(){
    //    return new TestDb();
    //}

}
