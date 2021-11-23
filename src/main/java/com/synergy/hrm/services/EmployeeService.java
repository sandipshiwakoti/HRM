package com.synergy.hrm.services;

import java.util.List;

import com.synergy.hrm.model.Employee;

import org.springframework.stereotype.Component;

@Component
public interface EmployeeService {
    List<Employee> getEmployees();

    void addEmployee(Employee Employee);

    Employee getEmployee(long id);

    void updateEmployee(Employee Employee);

    void deleteEmployee(long id);
}
