package com.zzj.cn.eyebuydirect.dao;

import com.zzj.cn.eyebuydirect.dto.BookDto;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository
public class BookCatalogDao {

    public static String BOOK_TABLE_PATH = "";

    private List<BookDto> bookDtos;


    @PostConstruct
    void init() {
        if (BOOK_TABLE_PATH == null || BOOK_TABLE_PATH.length() == 0) {
            throw new RuntimeException("Book table file does not exist!");
        }
        File file = new File(BOOK_TABLE_PATH);
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

    public void insert(BookDto bookDto) {
        bookDto.setId(UUID.randomUUID().toString());
        bookDtos.add(bookDto);
    }

    public void update() {
    }

    public List<BookDto> query() {
        return bookDtos;
    }

    public void delete(String name) {

    }



    public List<BookDto> getBookDtos() {
        return bookDtos;
    }

    public void setBookDtos(List<BookDto> bookDtos) {
        this.bookDtos = bookDtos;
    }

}
