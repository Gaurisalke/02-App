package com.gaurinova.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee 
{
    @EmbeddedId
	private EmployeeIdentity id;
    
    private String name;
    private String email;
    private String phoneNumber;
}