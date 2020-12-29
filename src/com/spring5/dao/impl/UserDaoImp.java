package com.spring5.dao.impl;

import com.spring5.dao.UserDao;

/**
 * @author lijichen
 * @date 2020/11/14 - 16:18
 */
public class UserDaoImp implements UserDao {
    @Override
    public void update() {
        System.out.println("dao update......");
    }
}
