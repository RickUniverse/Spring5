package com.spring5.ioc.annotation.service;

import com.spring5.ioc.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lijichen
 * @date 2020/11/15 - 16:06
 */
@Service(value = "userServiceAnnotation")
public class UserService {
    /*
    * 将userDao组合到userService
    * */
    //自动注解
//    @Autowired//按照类型进行注解
//    @Qualifier(value = "userDaoImp1")//需要在@Autowired注解基础上进行使用
//    private UserDao userDao;

    //根据类型名称进行注解
    @Resource(name = "userDaoImp1")
    private UserDao userDao;

    //普通类型注入
    @Value(value = "张三！")
    private String name;


    public void add() {
        System.out.println("UserService method...."+name);
        userDao.add();
    }
}
