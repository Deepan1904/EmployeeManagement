package com.employeeManagement.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.employeeManagement.demo.model.Employee;

@Repository
@EnableJpaRepositories
public interface EmployeeDao extends JpaRepository<Employee, String>{

}
