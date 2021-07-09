package com.cg.service;

import java.util.List;

import com.cg.entity.Employee;

public interface EmployeeSearchService {
	public Employee getEmployeeById(int id);
	public String addEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public String removeEmployeeById(int id);
	public List<Employee> getAllEmployee();


	

}
