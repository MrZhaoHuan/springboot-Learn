package com.zhao.boot.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-30 18:18
 * @描述
 **/
@Component
@ConditionalOnBean(User.class)
public class Person {

}
