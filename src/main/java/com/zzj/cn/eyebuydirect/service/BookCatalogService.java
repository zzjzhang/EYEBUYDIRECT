package com.zzj.cn.eyebuydirect.service;

import com.zzj.cn.eyebuydirect.dao.BookCatalogDao;
import com.zzj.cn.eyebuydirect.dto.BookDto;
import com.zzj.cn.eyebuydirect.entity.Book;
import com.zzj.cn.eyebuydirect.vo.BookVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCatalogService {

    @Resource
    private BookCatalogDao bookCatalogDao;

    public List<BookVo> query(String catalog) {
        List<BookDto> bookDtos = bookCatalogDao.query(catalog);
        return null;
    }

    public void insert() {

    }

    public void update() {

    }

    public void delete() {

    }

}
