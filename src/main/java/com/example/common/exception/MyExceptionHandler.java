package com.example.common.exception;

import com.example.common.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Noob
 * @date 2021/11/28 - 22:42
 */
@ControllerAdvice
public class MyExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result<Object> myHandler(Exception e){
        return Result.fail("系统错误："+e.getMessage());
    }
}
