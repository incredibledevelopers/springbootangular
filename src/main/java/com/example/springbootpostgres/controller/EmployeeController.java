package com.example.springbootpostgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootpostgres.model.Employee;
import com.example.springbootpostgres.service.EmployeeService;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;

	@GetMapping("employees")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = employeeService.getAllEmployees();
		return employeesList;
	}
	
	@GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }
}
