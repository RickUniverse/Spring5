package com.spring5.ioc.autowrite;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/14 - 17:22
 */
public class TestAutoWrite {
    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        System.out.println(context.getBean("autowrite"));
    }
}
