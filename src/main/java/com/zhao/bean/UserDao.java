package com.zhao.bean;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 10:12
 * @描述
 */
//@Repository
public class UserDao {
    public int calc(int a, int b) {
        System.out.println(a + "和" + b + "的商为:" + a / b);
        return a/b;
    }
}