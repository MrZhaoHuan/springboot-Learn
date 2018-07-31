package com.zhao.servlet3_0;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-26 20:36
 * @描述      servlet3.0新特性-ServletContainerInitializer
 */
@HandlesTypes({UserService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer{
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("---onStartup---");
        System.out.println(set);

        //注册servlet
        ServletRegistration.Dynamic helloServlet = servletContext.addServlet("helloServlet", HelloServlet.class);
        helloServlet.addMapping("/hello");
    }
}