package com.zhao.boot.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-30 22:22
 * @描述
 **/
@Component
@ConditionalOnClass(B.class)
public class A {

}
