package com.github.xychq8.sbtest.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by zhangxu on 2017/10/9.
 */
@Component
public class PrintTask {

    @Scheduled(cron="0 0/1 * * * *")
    private void process(){
        System.out.println("this is scheduler task runing  "+ new Date().getTime());
    }
}
