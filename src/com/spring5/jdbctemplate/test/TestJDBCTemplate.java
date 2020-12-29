package com.spring5.jdbctemplate.test;

import com.spring5.jdbctemplate.pojo.Book;
import com.spring5.jdbctemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/16 - 16:18
 */
public class TestJDBCTemplate {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bean = context.getBean("bookServiceJDBC", BookService.class);
//        bean.add(new Book(2,"王者","张三"));
        System.out.println(bean.count());
        //查询详细
        System.out.println(bean.queryBookInfo(1));
        //查询集合
        System.out.println(bean.queryList());

        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{"3","aaa","q"});
        objects.add(new Object[]{"4","bbb","w"});
        objects.add(new Object[]{"5","ccc","e"});
        bean.batchUpdate(objects);
        System.out.println(bean);
    }
}
