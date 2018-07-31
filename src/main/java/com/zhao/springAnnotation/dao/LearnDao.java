package com.zhao.springAnnotation.dao;

import com.zhao.springAnnotation.condition.MyCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 14:37
 * @描述      作用域和懒加载
 */
@Repository
//@Scope(scopeName = "prototype")
@Lazy(false)
@Conditional(value = {MyCondition.class})
public class LearnDao {

    public LearnDao(){
        System.out.println("learnDao实例化");
    }
}
