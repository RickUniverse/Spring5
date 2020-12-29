package com.spring5.ioc.annotation.dao.impl;

import com.spring5.ioc.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author lijichen
 * @date 2020/11/15 - 16:06
 */
/*注解*/
@Repository(value = "userDaoImp1")
public class UserDaoImp implements UserDao
{
    @Override
    public void add() {
        System.out.println("userDao method....");
    }
}
