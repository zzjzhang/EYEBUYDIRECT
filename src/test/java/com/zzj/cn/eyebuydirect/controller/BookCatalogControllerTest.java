package com.zzj.cn.eyebuydirect.controller;

import com.zzj.cn.eyebuydirect.dao.BookCatalogDao;
import com.zzj.cn.eyebuydirect.entity.Book;
import com.zzj.cn.eyebuydirect.entity.Catalog;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.service.HandlerRouter;
import org.junit.Before;
import org.junit.Test;


public class BookCatalogControllerTest {

    private BookCatalogDao bookCatalogDao;
    private HandlerRouter handlerRouter;
    private BookCatalogController bookCatalogController;


    @Before
    public void init() {
        handlerRouter = new HandlerRouter();
        handlerRouter.init();
        BookCatalogDao.BOOK_TABLE_PATH = ".../book_table.csv";
        bookCatalogDao = new BookCatalogDao();
        bookCatalogDao.init();
        HandlerRouter.HANDLER_MAP.get(Action.CREATE).setBookCatalogDao(bookCatalogDao);
        HandlerRouter.HANDLER_MAP.get(Action.REMOVE).setBookCatalogDao(bookCatalogDao);
        HandlerRouter.HANDLER_MAP.get(Action.CHANGE).setBookCatalogDao(bookCatalogDao);
        HandlerRouter.HANDLER_MAP.get(Action.QUERY).setBookCatalogDao(bookCatalogDao);
        bookCatalogController = new BookCatalogController();
        bookCatalogController.setHandlerRouter(handlerRouter);
    }

    @Test
    public void testCreate() {
        Catalog catalog = new Catalog();
        catalog.setName("IT");
        Book book = new Book();
        book.setName("name");
        book.setAuthor("author");
        book.setIsbn("isbn");
        book.setPublisher("publisher");
        book.setCatalog(catalog);
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setRequestId("requestId");
        baseRequest.setBook(book);
        bookCatalogController.create(baseRequest);
    }

    @Test
    public void testQuery() {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setRequestId("requestId");
        Catalog catalog = new Catalog();
        catalog.setName("IT");
        Book book = new Book();
        book.setCatalog(catalog);
        baseRequest.setBook(book);
        bookCatalogController.query(baseRequest);
    }

    @Test
    public void testChange() {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setRequestId("requestId");
        Catalog catalog = new Catalog();
        catalog.setName("IT");
        Book book = new Book();
        book.setName("name");
        book.setAuthor("author");
        book.setIsbn("isbn");
        book.setPublisher("publisher");
        book.setCatalog(catalog);
        baseRequest.setBook(book);
        bookCatalogController.change(baseRequest);
    }

    @Test
    public void testRemove() {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setRequestId("requestId");
        Catalog catalog = new Catalog();
        catalog.setName("IT");
        Book book = new Book();
        book.setName("name");
        book.setAuthor("author");
        book.setIsbn("isbn");
        book.setPublisher("publisher");
        book.setCatalog(catalog);
        baseRequest.setBook(book);
        bookCatalogController.remove(baseRequest);
    }

}
