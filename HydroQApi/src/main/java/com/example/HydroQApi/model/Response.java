package com.example.HydroQApi.model;

import java.util.List;

/*
 * this class is supposed to generate the final getString that is wanted
 * 
 * as of writing this it isn't complete but we'll see! 
 * 
 * IM WORKING ON IT 
 * JUST LOW ON TIME BUT I HOPE YOU CAN SEE I UNDERSTAND WHAT YOU WANT :)
 * 
 * 
 */




public class Response {

    //VALUES
    private List<Employee> employeeNames;

    private PowerOutage powerOutage;



// ACCESSOR & MUTATORS
    public List<Employee> getEmployeeNames() {
        return employeeNames;
    }

    public void setEmployeeNames(List<Employee> employeeNames) {
        this.employeeNames = employeeNames;
    }

    public PowerOutage getPowerOutage() {
        return powerOutage;
    }

    public void setPowerOutage(PowerOutage powerOutage) {
        this.powerOutage = powerOutage;
    }

    // toString
    @Override
    public String toString() {
        return "Response [employeeNames=" + employeeNames + ", powerOutage=" + powerOutage + "]";
    }

}