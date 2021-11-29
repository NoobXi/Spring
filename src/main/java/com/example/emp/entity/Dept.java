package com.example.emp.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Noob
 * @date 2021/11/28 - 18:22
 */
@Data
public class Dept implements Serializable {
    private Integer deptId;
    private String deptName;

}
