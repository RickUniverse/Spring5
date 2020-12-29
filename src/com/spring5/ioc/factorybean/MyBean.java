package com.spring5.ioc.factorybean;

import com.spring5.ioc.collection.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author lijichen
 * @date 2020/11/14 - 18:10
 */
public class MyBean implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        //factory bean
        return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
