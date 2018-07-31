package com.zhao.springAnnotation.annotation;

import com.zhao.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 21:25
 * @描述  属性赋值测试
 */
@Configuration
@PropertySource(value = "classpath:resource.properties",encoding = "UTF-8")
public class TestPropertyValue {
    @Bean
    public User user(){
        return new User();
    }
}
