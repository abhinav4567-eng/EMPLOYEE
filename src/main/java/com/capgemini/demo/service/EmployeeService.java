package com.capgemini.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.demo.model.Employee;
import com.capgemini.demo.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepo;

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepo.findAll();
	}

	public List<Employee> getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepo.findByName(name); 
	}

	public Employee updateEmployeeName(Employee employee) {
		Employee emp=employeeRepo.getById(employee.getId());
		if(emp!=null) {
			emp.setName(employee.getName());
		    
		
		return employeeRepo.save(emp);
	}
		return emp;
	}
	public Employee addEmployee(Employee emp) {
	   System.out.println("Employee Added");
		return employeeRepo.save(emp);
	}

	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
		
	}

}
