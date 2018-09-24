package com.zhao.springboot10cache.service;

import com.zhao.springboot10cache.bean.User;
import com.zhao.springboot10cache.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-09-24 16:32
 * @描述 测试缓存:
                @Cacheable
                @CachePut
                @CacheEvict
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //查询用户
    @Cacheable(cacheNames = "user" /** keyGenerator = "myKeyGenerator" **/)
    public User getUser(int id) {
        System.out.println("------查询id为" + id + "的用户------");
        return userDao.getUser(id);
    }

    //更新用户
    @CachePut(cacheNames = "user", key = "#user.id")
    public User updateUser(User user) {
        System.out.println("------更新id为" + user.getId() + "的用户------");
        userDao.updateUser(user);
        return user;
    }

    //删除缓存
    //todo: allEntries 删除名称为user的所有缓存
    @CacheEvict(cacheNames = "user", allEntries = true)
    public void invalidUser(int id) {
        System.out.println("------删除缓存中id为" + id + "的用户------");
    }

}