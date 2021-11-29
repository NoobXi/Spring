package com.example.emp.mapper;

import com.example.emp.entity.Emp;
import com.example.emp.vo.EmpQuery;

import java.util.List;

/**
 * @author Noob
 * @date 2021/11/28 - 15:57
 */
public interface EmpMapper {
    List<Emp> getEmpList(EmpQuery param);
    Long countEmpList(EmpQuery param);
    void addEmp(Emp emp);
    void deleteEmyByIds(String ids);
    Emp getEmpById(Integer id);
    void updateEmp(Emp emp);
}
