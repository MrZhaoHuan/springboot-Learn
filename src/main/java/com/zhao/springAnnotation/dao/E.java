package com.zhao.springAnnotation.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 20:53
 * @描述
 *          实现接口方式（InitializingBean,DisposableBean）
 *          或 注解方法方式（PostConstruct PreDestroy）
 *
 *           管理生命周期
 */
public class E  //implements InitializingBean,DisposableBean
{
    public E(){
        System.out.println("E构造函数");
    }

    @PostConstruct
    public void selfInit(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void selfDestroy(){
        System.out.println("销毁");
    }

    //@Override
    //public void afterPropertiesSet() throws Exception {
    //    System.out.println("实现接口方式初始化");
    //}
    //
    //@Override
    //public void destroy() throws Exception {
    //    System.out.println("实现接口方式销毁");
    //}
}
