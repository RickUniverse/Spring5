package com.spring5.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/14 - 15:16
 */
public class TestBean {
    @Test
    public void testBook() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        System.out.println(context.getBean("book"));
    }
    @Test
    public void testOrders() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        System.out.println(context.getBean("orders"));
    }


    /*
    * 内部bean
    * */
    @Test
    public void testEmp() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        System.out.println(context.getBean("emp2"));
    }

}
