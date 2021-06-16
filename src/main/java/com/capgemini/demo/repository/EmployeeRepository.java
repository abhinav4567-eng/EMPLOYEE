package com.capgemini.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByName(String name);
	

}

