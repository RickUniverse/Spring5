package com.spring5.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author lijichen
 * @date 2020/11/15 - 18:02
 */
public class TestProxy {
    public static void main(String[] args) {
        //接口集合
        Class[] classes = {UserDao.class};
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(TestProxy.class.getClassLoader(), classes,
                new UserDaoInvocationHandler(new UserDaoImp()));
        //执行方法
        userDaoProxy.add(1,2);
    }
}
class UserDaoInvocationHandler implements InvocationHandler {

    //组合被代理类
    private Object obj;
    public UserDaoInvocationHandler(Object obj) {
        //设置被代理类
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("被代理类"+method.getName()+"方法执行前的参数："+ Arrays.toString(args));

        //执行被代理类的方法并接受返回值
        Object result = method.invoke(this.obj, args);

        System.out.println("代理类内部的方法执行结果为："+result);
        System.out.println("被代理类的方法执行完成后："+method.getName()+"方法执行后的参数："+ Arrays.toString(args));
        //返回结果
        return result;
    }
}
