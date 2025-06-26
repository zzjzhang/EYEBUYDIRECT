package com.zzj.cn.eyebuydirect;

import com.zzj.cn.eyebuydirect.dao.BookCatalogDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("============ Please set book table file path ===============");
            return;
        }
        BookCatalogDao.BOOK_TABLE_PATH = args[0];
        SpringApplication.run(Application.class, args);
    }

}
