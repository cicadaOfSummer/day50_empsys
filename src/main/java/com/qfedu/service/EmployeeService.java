package com.qfedu.service;

import com.qfedu.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAllEmps();

    public void addEmp(Employee emp);

    public void deleteEmpById(Integer id);

    public Employee findEmpById(Integer id);

    public void updateEmp(Employee emp);
}
