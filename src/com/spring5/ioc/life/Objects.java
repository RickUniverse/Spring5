package com.spring5.ioc.life;

/**
 * @author lijichen
 * @date 2020/11/14 - 18:53
 */
public class Objects {
    public Objects(){
        System.out.println("第一步：调用无参构造器");
    }
    public String name;

    public void setName(String name) {
        System.out.println("第二步：调用属性的set方法赋值");
        this.name = name;
    }
    public void initMethod() {
        System.out.println("第三步：调用bean的初始化方法");
    }
    public void destoryMethod() {
        System.out.println("第五步：容器关闭后调用销毁方法");
    }
}
