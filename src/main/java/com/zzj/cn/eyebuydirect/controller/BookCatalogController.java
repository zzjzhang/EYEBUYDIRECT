package com.zzj.cn.eyebuydirect.controller;

import com.zzj.cn.eyebuydirect.service.BookCatalogService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/book-catalog")
public class BookCatalogController {

    @Resource
    private BookCatalogService bookCatalogService;

    @GetMapping("/query")
    public void query() {
        bookCatalogService.query();
    }

    @GetMapping("/update")
    public void update() {
        bookCatalogService.update();
    }

    @GetMapping("/create")
    public void create() {
        bookCatalogService.insert();
    }

    @GetMapping("/delete")
    public void delete() {
        bookCatalogService.delete();
    }

}
