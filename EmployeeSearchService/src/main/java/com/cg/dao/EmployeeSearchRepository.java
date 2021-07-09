package com.cg.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

@Repository
public interface EmployeeSearchRepository extends JpaRepository <Employee,Integer> {

}
