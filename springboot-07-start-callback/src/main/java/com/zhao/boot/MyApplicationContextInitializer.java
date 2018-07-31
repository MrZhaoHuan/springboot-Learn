package com.zhao.boot;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-31 14:35
 * @描述
 **/
public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        Map<String, Object> systemProperties = environment.getSystemProperties();

        System.out.println("----------------systemEnvironment---------------");
        for(String envKey:systemEnvironment.keySet()){
            System.out.println("-----------");
            System.out.println(envKey);
            System.out.println(systemEnvironment.get(envKey));
        }

        System.out.println("----------------systemProperties---------------");
        for(String propKey:systemProperties.keySet()){
            System.out.println("-----------");
            System.out.println(propKey);
            System.out.println(systemProperties.get(propKey));
        }
    }
}
