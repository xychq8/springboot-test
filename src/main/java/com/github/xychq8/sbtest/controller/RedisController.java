package com.github.xychq8.sbtest.controller;

import com.github.xychq8.sbtest.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangxu on 2017/10/19.
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisDao redisDao;

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    public String setKey(@RequestParam("key") String key, @RequestParam("value") String value){
        redisDao.setKey(key, value);
        return "success";
    }

    @RequestMapping(value = "/get/{key}", method = RequestMethod.GET)
    public String getValue(@PathVariable("key") String key){
        return redisDao.getValue(key);
    }

}
