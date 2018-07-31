package com.zhao.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-31 14:44
 * @描述
 **/
@Component
public class MyCommandLineRunner implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner.run"+args);
    }
}
