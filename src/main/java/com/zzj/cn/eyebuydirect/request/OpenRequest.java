package com.zzj.cn.eyebuydirect.request;


import com.zzj.cn.eyebuydirect.entity.Book;

public class OpenRequest {

    private String requestId;
    private Book book;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
