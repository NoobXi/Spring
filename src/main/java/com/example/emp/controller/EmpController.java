package com.example.emp.controller;

import com.example.common.vo.Result;
import com.example.emp.entity.Dept;
import com.example.emp.entity.Emp;
import com.example.emp.service.EmpService;
import com.example.emp.vo.EmpQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Noob
 * @date 2021/11/28 - 15:42
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("")
    public String toEmpListUI(){
        return "emp/empList";
    }

    @ResponseBody
    @GetMapping("list")
    public Result<Object> getEmpList(EmpQuery param){
        List<Emp> list=empService.getEmpList(param);
        Long count = empService.countEmpList(param);
        return Result.success(list,count);
    }

    @PostMapping("")
    @ResponseBody
    public Result<Object> addEmp(Emp emp){
        empService.addEmp(emp);
        return Result.success("新增员工成功！");
    }
    @GetMapping("/add/ui")
    public String toAddUI(Model model){
        List<Dept> deptList=empService.getAllDept();
        model.addAttribute("deptList",deptList);
        return "emp/empAdd";
    }
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteEmpByIds(@PathVariable("ids")String ids){
        empService.deleteEmyByIds(ids);
        return Result.success("删除员工成功！");
    }
    @GetMapping("/{id}")
    public String getEmpById(@PathVariable("id")Integer id,Model model){

        Emp emp =empService.getEmpById(id);
        model.addAttribute("emp",emp);
        model.addAttribute("deptList",empService.getAllDept());
        return "emp/empEdit";
    }
    @ResponseBody
    @PutMapping("")
    public Result<Object> updateEmp(Emp emp){
        empService.updateEmp(emp);
        return Result.success("员工信息修改成功");
    }
}

