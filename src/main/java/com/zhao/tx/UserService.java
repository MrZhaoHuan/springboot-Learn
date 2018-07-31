package com.zhao.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 20:24
 * @描述
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    //@Transactional
    public void saveUser(){
        userDao.insertUser();
        int a  = 1/0;
    }

}