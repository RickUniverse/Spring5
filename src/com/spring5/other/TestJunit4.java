package com.spring5.other;

import com.spring5.transcation.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lijichen
 * @date 2020/11/17 - 17:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean1.xml")
public class TestJunit4 {

    @Autowired//自动装配
    private UserService userService;

    @Test
    public void test(){
        userService.transferAccount();
    }
}
