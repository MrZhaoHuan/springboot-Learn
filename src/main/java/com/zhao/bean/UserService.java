package com.zhao.bean;

import lombok.ToString;
import org.springframework.stereotype.Service;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 10:12
 * @描述
 */
@Service
@ToString
public class UserService {
    //@Autowired
    private UserDao userDao;
   // @Value("18")
    private int age;

    //@Autowired
    //public UserService(UserDao userDao){
    //    this.userDao = userDao;
    //}

    public UserService(int  age){
        this.age = age;
    }
}