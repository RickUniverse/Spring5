package com.spring5.ioc.collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/14 - 17:22
 */
public class TestCollection {
    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        System.out.println(context.getBean("collection2"));
    }
}
