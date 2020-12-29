package com.spring5.ioc;

/**
 * @author lijichen
 * @date 2020/11/14 - 16:40
 */
public class Employee {
    private int eid;
    private String ename;
    private Department dept;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dept=" + dept +
                '}';
    }
}
