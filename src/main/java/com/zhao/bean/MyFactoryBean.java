package com.zhao.bean;

import com.zhao.springAnnotation.dao.D;
import org.springframework.beans.factory.FactoryBean;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 20:48
 * @描述
 */
public class MyFactoryBean implements FactoryBean<D> {
    @Override
    public D getObject() throws Exception {
        return new D();
    }

    @Override
    public Class<?> getObjectType() {
        return D.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}