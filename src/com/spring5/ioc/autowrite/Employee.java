package com.spring5.ioc.autowrite;

/**
 * @author lijichen
 * @date 2020/11/14 - 19:32
 */
public class Employee {
    private Department dept;

    @Override
    public String toString() {
        return "Employee{" +
                "dept=" + dept +
                '}';
    }
}
