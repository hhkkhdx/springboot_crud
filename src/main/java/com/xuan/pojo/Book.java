package com.xuan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_book")
public class Book {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;
}
