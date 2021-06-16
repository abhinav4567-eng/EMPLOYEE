package com.capgemini.demo.model;

import javax.persistence.*;

@Entity

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String name;
	private String designation;
	private int salary;
	
	public Employee() {
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String designation, int salary) {
		super();
		Id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	

}
