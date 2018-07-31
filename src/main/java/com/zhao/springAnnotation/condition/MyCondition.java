package com.zhao.springAnnotation.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 17:59
 * @描述
 */
public class MyCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        //rootBeanDefinition.setBeanClass(LearnDao.class);
        //context.getRegistry().registerBeanDefinition("learnDao",rootBeanDefinition);
        return true;
    }
}
