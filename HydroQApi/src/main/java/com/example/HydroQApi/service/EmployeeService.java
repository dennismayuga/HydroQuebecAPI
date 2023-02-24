
package com.example.HydroQApi.service;

import java.util.List;

import com.example.HydroQApi.model.Employee;

public interface EmployeeService {
 
    

List<Employee> getEmployees();
Employee saveEmployee(Employee employee);
Employee getSingleEmployee(Integer id);
void deleteEmployee(Integer id);
Employee updateEmployee(Employee employee);

}




