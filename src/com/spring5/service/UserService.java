package com.spring5.service;

import com.spring5.dao.UserDao;
import com.spring5.test.User;

/**
 * @author lijichen
 * @date 2020/11/14 - 16:19
 */
public class UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("userService add....");

        this.userDao.update();
    }
}
