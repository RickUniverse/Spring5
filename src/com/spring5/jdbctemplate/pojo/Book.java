package com.spring5.jdbctemplate.pojo;

/**
 * @author lijichen
 * @date 2020/11/16 - 16:45
 */
public class Book {
    private int bid;
    private String bname;
    private String author;

    public Book() {
    }

    public Book(int bid, String bname, String author) {
        this.bid = bid;
        this.bname = bname;
        this.author = author;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
