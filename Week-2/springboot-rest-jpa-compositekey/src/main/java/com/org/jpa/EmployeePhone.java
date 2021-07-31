package com.org.jpa;

import lombok.Getter;  
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@IdClass(EmployeePhoneId.class)
public class EmployeePhone {  
    @ManyToOne
    @PrimaryKeyJoinColumn
    private Employees employee;

    @Id
    private String phone;

    private Boolean isPrimary;

    public EmployeePhone(String phone, Boolean isPrimary) {
        this.phone = phone;
        this.isPrimary = isPrimary;
    }

	public void setEmployee(Employees employee2) {
		// TODO Auto-generated method stub
		
	}
}
