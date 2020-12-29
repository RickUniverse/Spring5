package com.spring5.ioc;

/**
 * @author lijichen
 * @date 2020/11/14 - 16:40
 */
public class Department {
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
