package com.org.jpa;

import lombok.Getter;  
import lombok.Setter;

import javax.persistence.*;  
import java.util.Set;

@Getter @Setter
@Entity
public class Employees {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<EmployeePhone> employeePhones;

    public Employees(String name, Set<EmployeePhone> employeePhones) {
        this.name = name;
        this.employeePhones = employeePhones;
        for (EmployeePhone employeePhone: employeePhones) {
           employeePhone.setEmployee(this);
        }
    }
}