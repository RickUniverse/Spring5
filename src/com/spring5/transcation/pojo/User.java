package com.spring5.transcation.pojo;

/**
 * @author lijichen
 * @date 2020/11/16 - 18:16
 */
public class User {
    private String uid;
    private String uname;
    private double money;

    public User() {
    }

    public User(String uid, String uname, double money) {
        this.uid = uid;
        this.uname = uname;
        this.money = money;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", money=" + money +
                '}';
    }
}
