package com.zzj.cn.eyebuydirect.dao;

import com.zzj.cn.eyebuydirect.dto.BookDto;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;


@Component
public class AsyncDataScheduler {

    private static Boolean TRIGGER = Boolean.TRUE;

    @Resource
    private BookCatalogDao bookCatalogDao;


    @PostConstruct
    public void sync() throws InterruptedException {
        while (TRIGGER) {
            List<BookDto> bookDtos = bookCatalogDao.getBookDtos();
            Thread.sleep(10 * 1000);
        }
    }

}
