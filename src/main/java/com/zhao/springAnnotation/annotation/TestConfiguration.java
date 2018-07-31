package com.zhao.springAnnotation.annotation;

import com.zhao.bean.MyFactoryBean;
import com.zhao.bean.Person;
import com.zhao.springAnnotation.condition.MyImportBeanDefinitionRegistrar;
import com.zhao.springAnnotation.condition.MyImportSelector;
import com.zhao.springAnnotation.dao.A;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 14:19
 * @描述      通过注解配置，注入bean
 */
@Configuration
@Import({A.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@ComponentScan(basePackages = {"com.zhao.springAnnotation.dao"},
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(Repository.class)
                // @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {LearnDao.class})
                //@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        })
public class TestConfiguration {
    @Bean
    public Person getPerson() {
        return new Person("zhao", 18);
    }

    @Bean
    public FactoryBean bean(){
        return new MyFactoryBean();
    }
}