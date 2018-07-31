package com.zhao.boot.mc.mapper;

import com.zhao.boot.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-31 10:39
 * @描述   mybatis_crud
 **/
//@Mapper
public interface UserMapper {

    @Select(value = {"select * from user"})
    List<User> queryUserList();

    @Insert("insert into user values(#{id},#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int addUser(User user);

    @Delete("delete  from user where id = #{id}")
    int deleteUser(int id);

    @Update("update user set name=#{name} where id = #{id}")
    int updateUser(User user);
}