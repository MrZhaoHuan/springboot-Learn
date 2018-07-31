package com.zhao.springAnnotation.annotation;

import com.zhao.aspect.UserDaoAspect;
import com.zhao.bean.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 13:32
 * @描述
 */
@Configuration
@EnableAspectJAutoProxy
public class TestAop {

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public UserDaoAspect userDaoAspect() {
        return new UserDaoAspect();
    }
}
