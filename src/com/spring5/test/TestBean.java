package com.spring5.test;

import com.spring5.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/12 - 17:24
 */
public class TestBean {
    @Test
    public void test() {
        //1，加载spring文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testService() {
        //1，加载spring文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserService user = context.getBean("userService", UserService.class);
        System.out.println(user);
        user.add();
    }
}
