package com.example.HydroQApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HydroQApi.model.Employee;
import com.example.HydroQApi.service.EmployeeService;

import jakarta.validation.Valid;




@RequestMapping("/api") //base address for controller
@RestController
public class EmployeeController {

@Autowired
private EmployeeService eService;


    // localhost:8080/api/getEmployees
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {

        return eService.getEmployees();
    }

    // localhost:8080/api/getEmployeeById/19
    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {   
        return eService.getSingleEmployee(id);
    }
    // localhost:8080/api/addEmployee
    @PostMapping("/addEmployee")
    public Employee postEmployee(@Valid @RequestBody Employee employee) {       // added @Valid to enforce JPA Validators
        return eService.saveEmployee(employee);
    }
    // localhost:8080/api/updateEmployee/19
    @PutMapping("/updateEmployee/{id}")
    public Employee putEmployeeById(@PathVariable("id") int id,@Valid @RequestBody Employee employee) { // added @Valid to enforce JPA Validators
        employee.setId(id);
        return eService.updateEmployee(employee);
    }

    // localhost:8080/api/deleteEmployee?id=19
    @DeleteMapping("/deleteEmployee")
    public String deleteEmployeeById(@RequestParam("id") int id) {
        return "Deleted employee for id "+id;
    }

}