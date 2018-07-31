package com.zhao.boot.servletComponent;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-30 16:34
 * @描述
 **/
public class MyServletContextListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContextListener----上下文对象创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContextListener----上下文对象销毁");
    }
}
