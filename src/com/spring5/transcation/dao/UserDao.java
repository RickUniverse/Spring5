package com.spring5.transcation.dao;

/**
 * @author lijichen
 * @date 2020/11/16 - 18:17
 */
public interface UserDao {
    //到账方法，多钱方法
    void addMoney();
    //转账方法，少钱方法
    void reduceMoney();
}
