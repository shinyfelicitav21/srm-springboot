package com.org.jpa;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeePhoneId implements Serializable {  
    private Employees employee;
    private String phone;

    public EmployeePhoneId() {

    }
}