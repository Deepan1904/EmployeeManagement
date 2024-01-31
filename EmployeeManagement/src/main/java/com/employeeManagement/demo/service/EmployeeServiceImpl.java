package com.employeeManagement.demo.service;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagement.demo.dao.EmployeeDao;
import com.employeeManagement.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Employee saveEmployeeData(Employee employee) {
		
			if(getbyEmpbyId(employee.getEmail()) != null)
			{
				return null;
			}

			 return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee getbyEmpbyId(String id) {
		
		Optional<Employee> optional=employeeDao.findById(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}

	@Override
	public void deletebyId(String id) {
		
		employeeDao.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeDao.save(employee);
	}
	
	
}
