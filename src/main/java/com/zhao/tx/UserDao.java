package com.zhao.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 20:24
 * @描述
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String sql = "insert into user (name,password) values (?,?)";

    public void insertUser(){
        jdbcTemplate.update(sql,"zhao3","123456");
    }

}