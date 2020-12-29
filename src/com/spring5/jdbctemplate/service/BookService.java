package com.spring5.jdbctemplate.service;

import com.spring5.jdbctemplate.dao.BookDao;
import com.spring5.jdbctemplate.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/16 - 16:16
 */
@Service(value = "bookServiceJDBC")
public class BookService {

    //组合dao
    @Autowired//按类型装配
    private BookDao bookDao;

    public void add(Book book) {
        bookDao.add(book);
    }

    public int count() {
        return bookDao.findCount();
    }

    public Book queryBookInfo(int bid) {
        return bookDao.queryBookInfo(bid);
    }

    public List<Book> queryList() {
        return bookDao.queryList();
    }

    public void batchUpdate(List<Object[]> objects) {
        bookDao.batchUpdate(objects);
    }
}
