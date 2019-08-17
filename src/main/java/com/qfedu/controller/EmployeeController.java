package com.qfedu.controller;

import com.qfedu.entity.Employee;
import com.qfedu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    @RequestMapping("/list.do")
    public String listEmp(Model model){
        List<Employee> list = empService.findAllEmps();
        model.addAttribute("empList", list);
        return "list";
    }

    @RequestMapping("/add.do")
    public String addEmp(Employee emp){
        empService.addEmp(emp);
        return "redirect:/list.do";
    }

    @RequestMapping("/delete.do")
    public String deleteEmp(Integer id){
        empService.deleteEmpById(id);
        return "redirect:/list.do";
    }

    @RequestMapping("/query.do")
    public String queryEmp(Integer id, Model model){
        Employee emp = empService.findEmpById(id);
        model.addAttribute("emp", emp);
        return "update";
    }

    @RequestMapping("/update.do")
    public String updateEmp(Employee emp){
        empService.updateEmp(emp);
        return "redirect:/list.do";
    }

}
