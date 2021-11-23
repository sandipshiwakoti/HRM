package com.synergy.hrm.controller;

import com.synergy.hrm.model.Employee;
import com.synergy.hrm.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService EmployeeService;

    @GetMapping("/employee")
    public String listEmployees(Model model) {
        model.addAttribute("employees", EmployeeService.getEmployees());
        return "employee";
    }

    @GetMapping("/employee/{id}")
    public String getEmployee(@PathVariable("id") long id, Model model) {
        model.addAttribute("employees", EmployeeService.getEmployee(id));
        return "employee";
    }

    @PostMapping("/createEmployee")
    public String createEmployee(Employee employee) {
        EmployeeService.addEmployee(employee);
        return "redirect:employee";
    }

    @PostMapping("/updateEmployee")
    public String editEmployee(Employee employee) {
        EmployeeService.updateEmployee(employee);
        return "redirect:employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String removeEmployee(@PathVariable("id") String id) {
        EmployeeService.deleteEmployee(Long.parseLong(id));
        return "redirect:../employee";
    }
}
