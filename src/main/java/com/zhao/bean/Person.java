package com.zhao.bean;

import lombok.*;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 14:07
 * @描述
 */
@Getter
@Setter
@ToString
public class Person {
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;
}
