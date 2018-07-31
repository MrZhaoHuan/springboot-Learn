package com.zhao;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-31 16:39
 * @描述
 **/
@ConfigurationProperties(prefix = "com.zhao")
public class ZhaoProperties {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}