package com.xuan.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xuan.pojo.Book;
import com.xuan.service.IBookService;
import com.xuan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public Result<List<Book>> getAll() {
        return Result.success(iBookService.list());
    }

    @PostMapping
    public Result<Boolean> save(@RequestBody Book book) {
        return Result.success(iBookService.saveBook(book));
    }

    @PutMapping
    public Result<Boolean> update(@RequestBody Book book) {
        return Result.success(iBookService.modify(book));
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> delete(@PathVariable Integer id) {
        return Result.success(iBookService.delete(id));
    }

    @GetMapping("/{id}")
    public Result<Book> getBookById(@PathVariable Integer id) {
        return Result.success(iBookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public Result<IPage<Book>> getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize, Book book) {
        IPage<Book> page = iBookService.getPage(currentPage, pageSize, book);
        if (currentPage > page.getPages()) {
            page = iBookService.getPage((int) page.getPages(), pageSize, book);
        }
        return Result.success(page);
    }


}
