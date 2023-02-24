package com.example.Library;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "EmployeeTable")      // assigning table
public class EmployeeModel {

    // Class Variables 

@Id // primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) // telling JPA to increment by one
@Column(name = "id")        // assigning column
private int id;

@NotEmpty(message = "First Name should not be NULL!")     // Calling JPA Validators
@Column(name = "first_name")
private String fName;

@NotEmpty(message = "Last Name should not be NULL!")     // Calling JPA Validators
@Column(name = "last_name")
private String lName;


@Column(name = "phone_number")
private String phoneNumber;


@Column(name = "emergency_number")
private String emergencyNumber;

@Email(message = "Not In Email Format!") // Checking if matches email format
@Column(name = "email")
private String email;


//  Constructor NO Args
public EmployeeModel(){

}


// Constructor ALL Args
public EmployeeModel(int id, String fName, String lName, String phoneNumber, String emergencyNumber, String email) {
    this.id = id;
    this.fName = fName;
    this.lName = lName;
    this.phoneNumber = phoneNumber;
    this.emergencyNumber = emergencyNumber;
    this.email = email;
}




// Accessor & Mutators


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}

public String getfName() {
    return fName;
}

public void setfName(String fName) {
    this.fName = fName;
}

public String getlName() {
    return lName;
}

public void setlName(String lName) {
    this.lName = lName;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public String getEmergencyNumber() {
    return emergencyNumber;
}

public void setEmergencyNumber(String emergencyNumber) {
    this.emergencyNumber = emergencyNumber;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}


// toString
@Override
public String toString() {
    return "employee [fName=" + fName + ", lName=" + lName + ", phoneNumber=" + phoneNumber + ", emergencyNumber="
            + emergencyNumber + ", email=" + email + "]";
}





    
}