package com.zhao.springAnnotation.annotation;

import com.zhao.springAnnotation.dao.E;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 20:52
 * @描述      测试初始化和销毁
 */
@Configuration
@ComponentScan({"com.zhao.springAnnotation.processor"})
public class TestInitDestroy {

    //@Bean(name = "E",initMethod = "selfInit",destroyMethod = "selfDestroy")
    //@Scope("prototype")
    //@Scope("singleton")

    @Bean(name = "E")
    public E getE(){
        return new E();
    }
}