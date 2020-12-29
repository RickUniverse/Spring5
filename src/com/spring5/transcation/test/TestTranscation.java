package com.spring5.transcation.test;

import com.spring5.config.TxConfig;
import com.spring5.transcation.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/16 - 18:27
 */
public class TestTranscation {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceTranscation", UserService.class);
        userService.transferAccount();
    }
    @Test
    public void testTxConfig() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userServiceTranscation", UserService.class);
        userService.transferAccount();
    }

    public static final Logger log = LoggerFactory.getLogger(TestTranscation.class);

    public static void main(String[] args) {
        log.error("错误");
        log.info("dddd");
    }
}
