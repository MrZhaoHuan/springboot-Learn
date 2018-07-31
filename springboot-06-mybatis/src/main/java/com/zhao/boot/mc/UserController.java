package com.zhao.boot.mc;

import com.zhao.boot.User;
import com.zhao.boot.mc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-31 10:35
 * @描述
 **/
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/userList",produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<User> list(){
        return userMapper.queryUserList();
    }

    @GetMapping("/deleteUser/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") int id){
          userMapper.deleteUser(id);
          return "删除成功";
    }

    @GetMapping("/updateUser")
    @ResponseBody
    public String updateUser(User user){
        userMapper.updateUser(user);
        return "更新成功";
    }

    @GetMapping("/addUser")
    @ResponseBody
    public User insertUser(User user){
        userMapper.addUser(user);
        return user;
    }
}