package com.zzj.cn.eyebuydirect.controller;

import com.zzj.cn.eyebuydirect.entity.Book;
import com.zzj.cn.eyebuydirect.service.BookCatalogService;
import com.zzj.cn.eyebuydirect.vo.BookVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/book-catalog")
public class BookCatalogController {

    @Resource
    private BookCatalogService bookCatalogService;

    @GetMapping("/query/{catalog}")
    public List<BookVo> query(@PathVariable("catalog") String catalog) {
        return bookCatalogService.query(catalog);
    }

    @PostMapping("/update")
    public void update(@RequestBody Book book) {
        bookCatalogService.update(book);
    }

    @PostMapping("/create")
    public void create(@RequestBody Book book) {
        bookCatalogService.insert(book);
    }

    @GetMapping("/delete")
    public void delete() {
        bookCatalogService.delete();
    }

}
