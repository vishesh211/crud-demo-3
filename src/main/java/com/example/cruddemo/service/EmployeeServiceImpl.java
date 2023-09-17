package com.example.cruddemo.service;

import com.example.cruddemo.dao.EmployeeDAO;
import com.example.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        employeeDao = employeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
