package com.employeeManagement.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.employeeManagement.demo.model.Employee;

@Service
public interface EmployeeService {
	
	public Employee saveEmployeeData(Employee employee); 
	
	public List<Employee> getAllEmployee();
	
	@Query("select e from employee e where e.email=:email")
	public Employee getbyEmpbyId(String email);
	
//	public Employee getbyEmpbyId(Long id);
	
	public void deletebyId(String id);
	
	public Employee updateEmployee(Employee employee);

}
