package com.zhao.boot;

import com.zhao.boot.mvc.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-29 13:16
 * @描述 国际化和视图映射
 **/
@Configuration
public class SelfViewConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LoginHandlerInterceptor interceptor = new LoginHandlerInterceptor();
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns("/", "/index.html", "/dashboard.html");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

}