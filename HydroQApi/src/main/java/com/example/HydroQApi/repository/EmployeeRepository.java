



package com.example.HydroQApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HydroQApi.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {     // Connecting to JPA repository passing employee object
    
}
