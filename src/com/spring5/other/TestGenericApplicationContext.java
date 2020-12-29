package com.spring5.other;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author lijichen
 * @date 2020/11/17 - 16:55
 */
public class TestGenericApplicationContext {
    @Test
    public void test() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        //注册
        context.registerBean("person11",Person.class,() -> new Person());
        //获取注册的对象
//        Person person11 = (Person) context.getBean("person11");
        Person person11 = (Person) context.getBean("com.spring5.other.Person");
        System.out.println(person11);
    }
}
