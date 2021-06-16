package com.capgemini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.model.Employee;
import com.capgemini.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
		
	}
	@GetMapping("/employees/{names}")
	public List<Employee> getEmployeesByName(@PathVariable("name") String name) {
		return employeeService.getEmployeesByName(name);
		
	}
	@PutMapping("/employees")
	public Employee updateEmployeesName(@RequestBody Employee emp) {
		return employeeService.updateEmployeeName(emp);
		
	}
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeeService.addEmployee(emp);
		
	}
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
}
}
