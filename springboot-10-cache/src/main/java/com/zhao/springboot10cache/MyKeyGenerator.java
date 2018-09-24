package com.zhao.springboot10cache;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-09-24 18:31
 * @描述      缓存key生成器
 **/
@Component("myKeyGenerator")
public class MyKeyGenerator implements KeyGenerator{

    @Override
    public Object generate(Object target, Method method, Object... params) {
        Object key = method+ Arrays.toString(params);
        System.out.println("缓存的key是:"+ key);
        return key;
    }
}
