
package com.example.HydroQApi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.HydroQApi.model.Employee;
import com.example.Library.EmployeeModel;

@Configuration
public class LibraryConfig {

@Bean
public EmployeeModel employee(){
    return new EmployeeModel();         // CALLING LIBRARY EMPLOYEE OBJECT


}

@Bean
public Employee employeee(){
    return new Employee();              // CALLING MODEL EMPLOYEE OBJECT
}


}
