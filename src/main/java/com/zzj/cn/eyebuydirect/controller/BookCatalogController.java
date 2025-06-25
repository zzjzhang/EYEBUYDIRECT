package com.zzj.cn.eyebuydirect.controller;

import com.zzj.cn.eyebuydirect.service.BookCatalogService;
import com.zzj.cn.eyebuydirect.vo.BookVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/update")
    public void update() {
        bookCatalogService.update();
    }

    @PostMapping("/create")
    public void create() {
        bookCatalogService.insert();
    }

    @GetMapping("/delete")
    public void delete() {
        bookCatalogService.delete();
    }

}
