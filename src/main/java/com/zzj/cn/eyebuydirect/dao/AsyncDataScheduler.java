package com.zzj.cn.eyebuydirect.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component
public class AsyncDataScheduler {

    private static Boolean trigger = Boolean.TRUE;


    @PostConstruct
    public void sync() {
        while (trigger) {

        }
    }

}
