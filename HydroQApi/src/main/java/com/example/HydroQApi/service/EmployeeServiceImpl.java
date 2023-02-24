package com.example.HydroQApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HydroQApi.model.Employee;
import com.example.HydroQApi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
@Autowired
private EmployeeRepository eRepository;     // Calling all JPA methods

@Override
public List<Employee> getEmployees() {
    return eRepository.findAll();
}

@Override
public Employee saveEmployee(Employee employee) {
    return eRepository.save(employee);
}

@Override
public Employee getSingleEmployee(Integer id) {
    Optional<Employee> employee = eRepository.findById(id);
    if(employee.isPresent()){
        return employee.get();
    }
    throw new RuntimeException("Employee is not found for the id "+id);
    }



@Override
public void deleteEmployee(Integer id) {
eRepository.deleteById(id);
}

@Override
public Employee updateEmployee(Employee employee) {
return eRepository.save(employee);

}





}


