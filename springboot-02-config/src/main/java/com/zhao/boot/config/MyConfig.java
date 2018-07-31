package com.zhao.boot.config;

import com.zhao.boot.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-27 21:55
 * @描述
 */
@Configuration
public class MyConfig {

    @Bean
    public Cat cat() {
        return new Cat();
    }
}