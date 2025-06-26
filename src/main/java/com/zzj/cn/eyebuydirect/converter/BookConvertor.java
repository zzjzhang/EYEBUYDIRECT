package com.zzj.cn.eyebuydirect.converter;

import com.zzj.cn.eyebuydirect.dto.BookDto;
import com.zzj.cn.eyebuydirect.entity.Book;


public class BookConvertor {

    private BookConvertor() {
    }

    public static BookDto convert(Book book) {
        if (book == null) {
            return null;
        }
        BookDto bookDto = new BookDto();
        bookDto.setName(book.getName());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setPublisher(book.getPublisher());
        bookDto.setCatalog(book.getCatalog().getName());
        return bookDto;
    }

}
