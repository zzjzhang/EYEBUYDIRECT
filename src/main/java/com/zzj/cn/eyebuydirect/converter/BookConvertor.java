package com.zzj.cn.eyebuydirect.converter;

import com.zzj.cn.eyebuydirect.dto.BookDto;
import com.zzj.cn.eyebuydirect.entity.Book;
import com.zzj.cn.eyebuydirect.entity.Catalog;
import com.zzj.cn.eyebuydirect.vo.BookVo;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


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
    }

    public static List<BookVo> convert(List<BookDto> bookDtos) {
        if (CollectionUtils.isEmpty(bookDtos)) {
            return null;
        }
        List<BookVo> bookVos = new ArrayList<>();
        for (BookDto bookDto : bookDtos) {
            List<Catalog> catalogs = new ArrayList<>();
            // catalogs.add(bookDto.getCatalog());
            BookVo bookVo = new BookVo();
            bookVo.setName(bookDto.getName());
            bookVo.setAuthor(bookDto.getAuthor());
            bookVo.setIsbn(bookDto.getIsbn());
            bookVo.setPublisher(bookDto.getPublisher());
            bookVos.add(bookVo);
        }
        return null;
    }

}
