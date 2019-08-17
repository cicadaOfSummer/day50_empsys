package com.qfedu.dao;

import com.qfedu.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> findAll();

    public void add(Employee emp);

    public void deleteById(Integer id);

    public Employee findById(Integer id);

    public void update(Employee emp);

}
