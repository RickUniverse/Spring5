package com.spring5.aop.aspect.xml;

/**
 * @author lijichen
 * @date 2020/11/16 - 15:38
 */
public class BookProxy {
    private void before() {
        System.out.println("BookProxy before....");
    }
}
