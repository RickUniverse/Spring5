package com.spring5.aop.proxy;

/**
 * @author lijichen
 * @date 2020/11/15 - 18:02
 */
public class UserDaoImp implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void update(int a, int b) {

    }
}
