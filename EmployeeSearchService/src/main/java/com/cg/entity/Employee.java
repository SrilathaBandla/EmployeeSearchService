package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private int eid;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_designation")
	private String designation;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int eid, String name, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", designation=" + designation + "]";
	}
	

}
