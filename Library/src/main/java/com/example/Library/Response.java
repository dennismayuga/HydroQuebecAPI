package com.example.Library;

import java.util.List;

public class Response {
    
private List<EmployeeModel> employeeNames;

private PowerOutageModel powerOutage;

public List<EmployeeModel> getEmployeeNames() {
    return employeeNames;
}

public void setEmployeeNames(List<EmployeeModel> employeeNames) {
    this.employeeNames = employeeNames;
}

public PowerOutageModel getPowerOutage() {
    return powerOutage;
}

public void setPowerOutage(PowerOutageModel powerOutage) {
    this.powerOutage = powerOutage;
}

@Override
public String toString() {
    return "Response [employeeNames=" + employeeNames + ", powerOutage=" + powerOutage + "]";
}





}
