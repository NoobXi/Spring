package com.example.common.vo;

import lombok.Data;

/**
 * @author Noob
 * @date 2021/11/27 - 17:14
 */
@Data

public class Result<T> {
    public Result(){}

    public Result(Integer code, String message, T data, Long count) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.count = count;
    }

    //返回码
    private Integer code;
    //返回描述
    private String message;
    //返回数据
    private T data;
    //分页查询总记录
    private Long count;

    public static Result<Object> success() {
        return new Result(0, "success", null, null);
    }

    public static Result<Object> success(String message) {
        return new Result(0, message, null, null);
    }

    public static Result<Object> success(Object data, Long count) {
        return new Result(0, "success", data, count);
    }

    public static Result<Object> fail() {
        return new Result(1, "fail", null, null);
    }

    public static Result<Object> fail(String message) {
        return new Result(1, message, null, null);
    }
}
