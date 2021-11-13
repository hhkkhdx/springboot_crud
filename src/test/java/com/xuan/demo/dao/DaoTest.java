package com.xuan.demo.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuan.dao.BookDao;
import com.xuan.pojo.Book;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DaoTest {
    @Autowired
    BookDao bookDao;

    @Test
    void testPage() {
        IPage<Book> page = new Page(1, 5);
        bookDao.selectPage(page, null);
        List<Book> books = page.getRecords();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    void testCondition() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "java");
        bookDao.selectList(qw);
    }

    @Test
    void testCondition2() {
        String name = "Java";
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(Strings.isNotEmpty(name) ,Book::getName, name);
        bookDao.selectList(qw);
    }
}
