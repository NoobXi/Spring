package com.example.emp.service;

import com.example.emp.entity.Dept;
import com.example.emp.entity.Emp;
import com.example.emp.vo.EmpQuery;

import java.util.List;

/**
 * @author Noob
 * @date 2021/11/28 - 15:50
 */
public interface EmpService {
    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);
    List<Dept> getAllDept();

    void deleteEmyByIds(String ids);
    Emp getEmpById(Integer id);
    void updateEmp(Emp emp);
}
