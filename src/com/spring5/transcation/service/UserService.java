package com.spring5.transcation.service;

import com.spring5.transcation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lijichen
 * @date 2020/11/16 - 18:20
 */
@Service(value = "userServiceTranscation")
@Transactional(rollbackFor = {Exception.class}, readOnly = false, timeout = -1, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)//所有方法开启 事务
public class UserService {

    @Autowired
    private UserDao userDao;

    public void transferAccount() {
        userDao.reduceMoney();

        int i = 10 / 0;

        userDao.addMoney();
    }
}
