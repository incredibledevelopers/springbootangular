package com.example.springbootpostgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootpostgres.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
