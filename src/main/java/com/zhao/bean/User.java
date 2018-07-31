package com.zhao.bean;

import lombok.ToString;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 21:28
 * @描述
 */
@ToString
public class User {
   // @Value("赵寰")
    private String name;
   // @Value("#{100-20}")
    private double money;
    //@Value("${user.address}")
    private String adress;

    public User(){

    }
    public User(String name,double money){
        this.name = name;
        this.money = money;
    }
}
