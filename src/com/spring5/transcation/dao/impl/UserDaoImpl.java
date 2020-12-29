package com.spring5.transcation.dao.impl;

import com.spring5.transcation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author lijichen
 * @date 2020/11/16 - 18:20
 */
@Repository(value = "userDaoImplTranscation")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public void addMoney() {
        template.update("update account_table set money = money + ? where user_id = ?",
                100,2);
    }

    @Override
    public void reduceMoney() {
        template.update("update account_table set money = money - ? where user_id = ?",
                100,1);
    }
}
