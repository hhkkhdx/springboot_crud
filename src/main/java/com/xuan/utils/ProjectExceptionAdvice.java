package com.xuan.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public Result<?> doException(Exception ex) {
        ex.printStackTrace();
        return Result.error("300", "服务器故障,请联系管理员!");
    }

}
