package com.spring5.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author lijichen
 * @date 2020/11/16 - 15:08
 */
@Component
@Aspect
@Order(1)//多个增强类的先后顺序，值越小优先级越高
public class PersonProxy {

    //抽取相同切入点
    @Pointcut(value = "execution(* com.spring5.aop.aspect.User.add(..))")
    public void pointcutDemo() {}

    @Before(value = "pointcutDemo()")
    public void before() {
        System.out.println("personProxy before method ....");
    }
}
