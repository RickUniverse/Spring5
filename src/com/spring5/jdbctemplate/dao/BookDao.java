package com.spring5.jdbctemplate.dao;

import com.spring5.jdbctemplate.pojo.Book;

import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/16 - 16:14
 */
public interface BookDao {

    void add(Book book);

    int findCount();

    Book queryBookInfo(int bid);

    List<Book> queryList();

    void batchUpdate(List<Object[]> objects);
}
