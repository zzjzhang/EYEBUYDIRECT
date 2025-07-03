package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.dao.BookCatalogDao;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.OpenRequest;
import com.zzj.cn.eyebuydirect.response.OpenResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public abstract class AbstractHandler {

    @Resource
    protected BookCatalogDao bookCatalogDao;

    public abstract OpenResponse handle(OpenRequest openRequest);

    public abstract Action getAction();

    abstract void setAction(Action action);


    public BookCatalogDao getBookCatalogDao() {
        return bookCatalogDao;
    }

    public void setBookCatalogDao(BookCatalogDao bookCatalogDao) {
        this.bookCatalogDao = bookCatalogDao;
    }

}
