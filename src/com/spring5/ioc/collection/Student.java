package com.spring5.ioc.collection;

/**
 * @author lijichen
 * @date 2020/11/14 - 17:49
 */
public class Student {
    public String sname;

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                '}';
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
