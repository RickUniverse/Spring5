package com.spring5.ioc.life;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/14 - 18:56
 */
public class TestLife {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        System.out.println(context.getBean("objects"));
        System.out.println("第四步：获取到bean实例");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
