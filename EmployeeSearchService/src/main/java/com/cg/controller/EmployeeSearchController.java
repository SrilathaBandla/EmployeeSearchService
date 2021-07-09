package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.service.EmployeeSearchService;

@RestController
@RefreshScope
public class EmployeeSearchController {
	@Autowired
	EmployeeSearchService service;
	
	@CrossOrigin
	@GetMapping("/employee/find/{id}")
	public Employee findById(@PathVariable int id)
	{
		return service.getEmployeeById(id);
	}
	
	@CrossOrigin
	@GetMapping("/employee/findAll")
	public List<Employee> findById()
	{
		return service.getAllEmployee();
	}
	
	@CrossOrigin
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee emp)
	{
		service.addEmployee(emp);
		return "Employee Addedd Successfully";
				
	}
	 @CrossOrigin
	 @GetMapping("/employee")
	 public List<Employee>  getAll(){
		 return service.getAllEmployee();
		 
	 }
  
    @CrossOrigin
	 @PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable int id,@RequestBody Employee emp)
	 {
	 return service.updateEmployee(emp);
	 }
	
   
     @CrossOrigin
     @DeleteMapping("/employee/{id}")
     public String removeEmployeeById(@PathVariable int id)
     {
     return service.removeEmployeeById(id);
     }
    

}
