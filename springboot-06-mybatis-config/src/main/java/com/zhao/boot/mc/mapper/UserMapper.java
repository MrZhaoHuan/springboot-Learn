package com.zhao.boot.mc.mapper;

import com.zhao.boot.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-31 11:44
 * @描述
 **/
@Mapper
public interface UserMapper {
    List<User> userList();
}