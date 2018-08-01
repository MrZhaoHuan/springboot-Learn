package com.zhao.boot.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-08-01 12:14
 * @描述
 **/
@RestController
public class HelloConsumer {

    @Reference
    private HelloProvider helloProvider;

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return helloProvider.hello(name);
    }

}
