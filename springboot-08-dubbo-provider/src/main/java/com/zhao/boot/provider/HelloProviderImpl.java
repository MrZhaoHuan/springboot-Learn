package com.zhao.boot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-08-01 12:04
 * @描述
 **/
@Component
@Service
public class HelloProviderImpl implements HelloProvider {
    @Override
    public String hello(String name) {
        return "欢迎您:"+name;
    }
}
