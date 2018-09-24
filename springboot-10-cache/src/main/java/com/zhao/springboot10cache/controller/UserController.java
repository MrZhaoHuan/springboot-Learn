package com.zhao.springboot10cache.controller;

import com.zhao.springboot10cache.bean.User;
import com.zhao.springboot10cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-09-24 16:33
 * @描述
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @GetMapping("/updateUser")
    public boolean updateUser(User user) {
        userService.updateUser(user);
        return true;
    }

    @GetMapping("/invalidUser/{id}")
    public String invalidUser(@PathVariable("id") int id) {
        userService.invalidUser(id);
        return "success";
    }
}
