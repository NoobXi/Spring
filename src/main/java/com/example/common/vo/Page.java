package com.example.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Noob
 * @date 2021/11/28 - 15:44
 */
@Data
public class Page implements Serializable {
    private Integer page;
    private Integer limit;
    public Long getStart(){
        return (page - 1L)*limit;
    }
}
