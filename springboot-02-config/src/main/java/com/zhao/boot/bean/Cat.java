package com.zhao.boot.bean;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-27 17:52
 * @描述
 */
public class Cat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
