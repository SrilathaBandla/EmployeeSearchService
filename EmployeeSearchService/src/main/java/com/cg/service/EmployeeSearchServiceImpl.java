package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeSearchRepository;
import com.cg.entity.Employee;

@Service
public class EmployeeSearchServiceImpl implements EmployeeSearchService{
	
	@Autowired
	EmployeeSearchRepository repository;
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	@Override
	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repository.save(emp);
		return "New Employee Added";
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//IF EMPLOYEE WILL HAVE NEW DATA OTHER THAN PK 
		Employee updateEmployee=emp;
		return repository.save(updateEmployee);
	}

	@Override
	public String removeEmployeeById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "Employee with Id"+id+"deleted";
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) repository.findAll();
	}

}



