package com.example.emp.vo;

import com.example.common.vo.Page;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Noob
 * @date 2021/11/28 - 15:45
 */
@Data
public class EmpQuery extends Page {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date endDate;
}
