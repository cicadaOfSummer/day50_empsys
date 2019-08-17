package com.qfedu.service.impl;

import com.qfedu.dao.EmployeeDao;
import com.qfedu.entity.Employee;
import com.qfedu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    // required 表示是否必须赋值
    @Autowired(required = false)
    private EmployeeDao empDao;
    @Override
    public List<Employee> findAllEmps() {
        return empDao.findAll();
    }

    @Override
    public void addEmp(Employee emp) {
        empDao.add(emp);
    }

    @Override
    public void deleteEmpById(Integer id) {
        empDao.deleteById(id);
    }

    @Override
    public Employee findEmpById(Integer id) {
        return empDao.findById(id);
    }

    @Override
    public void updateEmp(Employee emp) {
        empDao.update(emp);
    }
}
