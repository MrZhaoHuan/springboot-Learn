package com.zhao.boot.mc;

import com.zhao.boot.User;
import com.zhao.boot.mc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-31 11:46
 * @描述
 **/
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/userList")
    public List<User> userList(){
        return userMapper.userList();
    }

}