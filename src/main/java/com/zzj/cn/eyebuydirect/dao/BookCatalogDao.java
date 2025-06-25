package com.zzj.cn.eyebuydirect.dao;

import com.zzj.cn.eyebuydirect.dto.BookDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


@Repository
public class BookCatalogDao {

    private List<BookDto> bookDtos;

    @PostConstruct
    void init() {
        URL bookTableFileUrl = BookCatalogDao.class.getResource("book_table.csv");
        if (bookTableFileUrl.getPath() == null) {
            throw new RuntimeException("File does not exist!");
        }
        File file = new File(bookTableFileUrl.getPath());
        try {
            bookDtos = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String bookRowStr;
            int rowIndex = 1;
            List<String> fields = new ArrayList<>();
            while ((bookRowStr = bufferedReader.readLine()) != null) {
                String[] bookRowFields = bookRowStr.split(",");
                if (rowIndex == 1) {
                    for (int i = 0; i < bookRowFields.length; i++) {
                        fields.add(bookRowFields[i]);
                    }
                    rowIndex++;
                    continue;
                }
                for (int i = 0; i < bookRowFields.length; i++) {
                    BookDto bookDto = new BookDto();
                    bookDto.getClass().getField(fields.get(i)).setAccessible(Boolean.TRUE);
                    BookDto.class.getField(fields.get(i)).set(bookDto, bookRowFields[i]);
                    bookDtos.add(bookDto);
                }
                rowIndex++;
            }
        } catch (Exception e) {
            throw new RuntimeException("File read exception!");
        }
    }

    public void insert() {

    }

    public void update() {

    }

    public List<BookDto> query(String catalog) {
        return new ArrayList<>();
    }

    public void delete() {

    }

}
