package com.zhao.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 13:37
 * @描述 注解方式：aop切面
 */
@Aspect
public class UserDaoAspect {

    @Pointcut("execution(public * com.zhao.bean.UserDao.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinpoint) {
        System.out.println("before:方法名称 "+joinpoint.getSignature().getName());
    }

    @AfterThrowing("pointCut()")
    public void afterThrow() {
        System.out.println("AfterThrowing");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning(value = "pointCut()",returning="result")
    public void afterReturning(Object result) {
        System.out.println("afterReturning");
        System.out.println("返回结果："+result);
    }



}