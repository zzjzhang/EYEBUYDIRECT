package com.zzj.cn.eyebuydirect.request;

import com.zzj.cn.eyebuydirect.entity.Catalog;


public class BaseRequest {

    private String name;
    private String author;
    private String isbn;
    private String publisher;
    private Catalog catalogs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Catalog getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Catalog catalogs) {
        this.catalogs = catalogs;
    }
}
