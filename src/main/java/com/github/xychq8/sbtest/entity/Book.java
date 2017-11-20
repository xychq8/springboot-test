package com.github.xychq8.sbtest.entity;

import java.io.Serializable;

/**
 * Created by zhangxu on 2017/10/19.
 */
public class Book implements Serializable{
    private static final long serialVersionUID = -7678738257527891334L;

    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
