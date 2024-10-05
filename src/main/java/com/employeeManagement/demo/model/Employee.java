package com.employeeManagement.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {
	
	private long empId;
	private String fname;
	private String lname
	@Id
	private String email;
	
	@PrePersist
    public void generateCustomId() {
		
        this.empId = Long.parseLong(String.format("%d%d", System.currentTimeMillis(), (int) (Math.random() * 1000)));
    }
	
	public Employee() {
		super();
	}
	public Employee(long empId, String fname, String lname, String email) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	

}
