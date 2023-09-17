package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> typedQuery = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = typedQuery.getResultList();
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee employee1 = entityManager.merge(employee);
        return employee1;
    }

    @Override
    public void deleteById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
