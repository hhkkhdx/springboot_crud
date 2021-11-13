package com.xuan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xuan.pojo.Book;

public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);
    boolean modify(Book book);
    boolean delete(Integer id);
    IPage<Book> getPage(Integer currentPage, Integer pageSize);
    IPage<Book> getPage(Integer currentPage, Integer pageSize, Book book);
}
