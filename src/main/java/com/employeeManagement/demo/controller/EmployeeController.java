package com.employeeManagement.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagement.demo.model.Employee;
import com.employeeManagement.demo.service.EmployeeServiceImpl;


@CrossOrigin
@RequestMapping("/api")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/get")
	public String HelloWorld()
	{
		return "Hai I am executing";
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
		
		Employee save = employeeServiceImpl.saveEmployeeData(employee);
		
		return new ResponseEntity<Employee> (save,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> allEmployee = employeeServiceImpl.getAllEmployee();
		
		return new ResponseEntity<List<Employee>>(allEmployee,HttpStatus.OK);
		
	}
	
	@GetMapping("getbyId/{id}")
	public ResponseEntity<Employee> getbyEmployeeId(@PathVariable String id){
		
		Employee getbyId = employeeServiceImpl.getbyEmpbyId(id);
		
		return new ResponseEntity<Employee>(getbyId,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteID/{id}")
	public ResponseEntity<String>  deletebyId(@PathVariable String id){
		
		employeeServiceImpl.deletebyId(id);
		
		return new ResponseEntity<String>("Deleted Suucessfully",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		
		Employee updatedEmployee = employeeServiceImpl.updateEmployee(employee);
				
		return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.OK);
		
	}
	
	
}
