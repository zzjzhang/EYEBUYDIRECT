package com.zzj.cn.eyebuydirect.service;

import com.zzj.cn.eyebuydirect.converter.BookConvertor;
import com.zzj.cn.eyebuydirect.dao.BookCatalogDao;
import com.zzj.cn.eyebuydirect.dto.BookDto;
import com.zzj.cn.eyebuydirect.entity.Book;
import com.zzj.cn.eyebuydirect.vo.BookVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


@Service
public class BookCatalogService {

    @Resource
    private BookCatalogDao bookCatalogDao;

    public List<BookVo> query() {
        List<BookDto> bookDtos = bookCatalogDao.query();
        if (CollectionUtils.isEmpty(bookDtos)) {
            return null;
        }
        return BookConvertor.convert(bookDtos);
    }

    public void insert(Book book) {

    }

    public void update(Book book) {

    }

    public void delete() {

    }

}
