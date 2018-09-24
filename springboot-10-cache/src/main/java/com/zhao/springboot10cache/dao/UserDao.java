package com.zhao.springboot10cache.dao;

import com.zhao.springboot10cache.bean.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-09-24 16:21
 * @描述
 **/
@Repository
public class UserDao {
    private Map<Integer, User> userMap = new HashMap<>();

    public UserDao() {
        initUserMap();
    }

    private void initUserMap() {
        userMap.put(1, new User(1, "zhao"));
        userMap.put(2, new User(2, "zhang"));
        userMap.put(3, new User(3, "wang"));
    }

    //查询用户
    public User getUser(Integer id) {
        return userMap.get(id);
    }

    //更新用户
    public void updateUser(User user) {
        if (userMap.containsKey(user.getId())) {
            userMap.put(user.getId(), user);
        }
    }
}