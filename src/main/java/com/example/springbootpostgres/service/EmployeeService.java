package com.example.springbootpostgres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springbootpostgres.model.Employee;
import com.example.springbootpostgres.repository.EmployeeRepository;

@Component
public class EmployeeService {
	@Autowired
	public EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

}
