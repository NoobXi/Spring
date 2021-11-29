package com.example.emp.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Noob
 * @date 2021/11/28 - 15:40
 */
@Data
public class Emp implements Serializable {
    private Integer empId;
    private String name;
    private String sex;
    private Integer age;
    private double sal;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String address;
    private Integer deptId;
    private Dept dept;
}
