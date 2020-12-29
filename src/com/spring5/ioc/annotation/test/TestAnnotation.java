package com.spring5.ioc.annotation.test;

import com.spring5.ioc.annotation.config.SpringConfig;
import com.spring5.ioc.annotation.service.ServiceBean;
import com.spring5.ioc.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/15 - 15:31
 */
public class TestAnnotation {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        ServiceBean serviceBean = context.getBean("serviceBean", ServiceBean.class);
        System.out.println(serviceBean);
    }
    @Test
    public void testUserService() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceAnnotation", UserService.class);
        userService.add();
    }
    //完全注解开发
    @Test
    public void testConfig() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userServiceAnnotation", UserService.class);
        userService.add();
    }
}
