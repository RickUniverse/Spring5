package com.spring5.jdbctemplate.dao.impl;

import com.spring5.jdbctemplate.dao.BookDao;
import com.spring5.jdbctemplate.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/16 - 16:15
 */
@Component(value = "bookDaoImpJDBC")
public class BookDaoImp implements BookDao {

    //组合jdbcTemplate
    @Autowired//自动装配
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        jdbcTemplate.update("insert into book_table values(?,?,?)",book.getBid(),book.getBname(),book.getAuthor());
    }

    @Override
    public int findCount() {
        return jdbcTemplate.queryForObject("select count(*) from book_table",Integer.class);
    }

    @Override
    public Book queryBookInfo(int bid) {
        return jdbcTemplate.queryForObject("select book_id bid, book_name bname, book_author author from book_table where book_id = ?",
                new BeanPropertyRowMapper<Book>(Book.class),
                bid);
    }

    @Override
    public List<Book> queryList() {
        return jdbcTemplate.query("select book_id bid, book_name bname, book_author author from book_table",
                new BeanPropertyRowMapper<Book>(Book.class));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        int[] ints = jdbcTemplate.batchUpdate("insert into book_table values(?,?,?)", batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
