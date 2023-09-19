package com.example.cruddemo.repository;

import com.example.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "members")
public interface EmployeeInterface extends JpaRepository<Employee, Integer> {
}
