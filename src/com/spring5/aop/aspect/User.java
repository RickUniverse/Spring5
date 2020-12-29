package com.spring5.aop.aspect;

import org.springframework.stereotype.Component;

/**
 * @author lijichen
 * @date 2020/11/15 - 19:16
 */
//被增强的类
@Component(value = "userAspect")
public class User {
    public void add() {
//        int a = 10 / 0;
        System.out.println("user add method...");
    }
}
