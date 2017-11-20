package com.github.xychq8.sbtest.dao;

import com.github.xychq8.sbtest.entity.Book;

/**
 * Created by zhangxu on 2017/10/19.
 */
public interface BookRepository {

    Book getByIsbn(String isbn);

}
