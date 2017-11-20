package com.github.xychq8.sbtest.controller;

import com.github.xychq8.sbtest.SpringbootTestApplication;
import com.github.xychq8.sbtest.dao.SimpleBookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangxu on 2017/10/23.
 */
@RestController
public class CacheController {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootTestApplication.class);

    @Autowired
    private SimpleBookRepository simpleBookRepository;

    @RequestMapping("/book")
    public String getBook(){
        logger.info("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + simpleBookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + simpleBookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));
        return "OK";
    }
}
