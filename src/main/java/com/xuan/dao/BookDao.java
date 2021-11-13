package com.xuan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xuan.pojo.Book;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
