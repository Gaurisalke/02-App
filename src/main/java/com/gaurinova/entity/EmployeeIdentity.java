package com.gaurinova.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class EmployeeIdentity implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String empId;
	private String companyId;
}