package com.zhao.springAnnotation.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 20:55
 * @描述     生命周期测试：初始化和销毁
 */
public class TestInitDestroy {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.zhao.springAnnotation.annotation.TestInitDestroy.class);

    @Test
    public void init_Destroy1(){
        context.close();
    }

}