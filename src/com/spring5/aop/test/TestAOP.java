package com.spring5.aop.test;

import com.spring5.aop.aspect.User;
import com.spring5.aop.aspect.xml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/15 - 19:44
 */
public class TestAOP {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("userAspect", User.class);
        //测试
        user.add();
    }
    @Test
    public void testXml() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("bookAop", Book.class);
        //测试
        book.buy();
    }
}
