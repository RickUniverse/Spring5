package com.spring5.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 * @author lijichen
 * @date 2020/11/15 - 19:17
 */
@Component
@Aspect//生成代理对象
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* com.spring5.aop.aspect.User.add(..))")
    public void pointcutDemo(){}

    //前置通知
    @Before(value = "pointcutDemo()")
    public void before() {
        System.out.println("userProxy before method...");
    }

    //后置置通知
    @After(value = "execution(* com.spring5.aop.aspect.User.add(..))")
    public void after() {
        System.out.println("userProxy after method...");
    }

    //环绕通知
    @Around(value = "execution(* com.spring5.aop.aspect.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("userProxy before around method...");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("userProxy after around method...");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.spring5.aop.aspect.User.add(..))")
    public void afterThrowing() {
        System.out.println("userProxy afterThrowing method...");
    }
    //最终通知（返回通知）
    @AfterReturning(value = "execution(* com.spring5.aop.aspect.User.add(..))")
    public void afterReturning() {
        System.out.println("userProxy afterReturning method...");
    }


}
