package com.xuan.demo.service;

import com.xuan.pojo.Book;
import com.xuan.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceImpl {

    @Autowired
    private IBookService iBookService;

    @Test
    void test01() {
        Book book = iBookService.getById(1);
        System.out.println(book);
    }
}
