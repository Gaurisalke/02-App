package com.gaurinova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurinova.entity.Employee;
import com.gaurinova.entity.EmployeeIdentity;
import com.gaurinova.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo er;
	
	public void saveEmployee()
	{
		EmployeeIdentity ei = new EmployeeIdentity();
		
		ei.setEmpId("E-70");
		ei.setCompanyId("C-1002");
		
		Employee e = new Employee();
		e.setId(ei);
		e.setName("Sam");
		e.setEmail("sam.tcs.com");
		e.setPhoneNumber("1234567899");
		
		Employee savedEmployee = er.save(e);
		System.out.println("Saved Employee = "+savedEmployee);		
		
	}
	
	// Retrieving an employee record with the composite primary key
	public void getEmployee()
	{		
		EmployeeIdentity ei = new EmployeeIdentity();
		
			ei.setEmpId("E-70");
			ei.setCompanyId("C-1002");
		
			Optional<Employee> byId = er.findById(ei);
			System.out.println("Fetch Employee : "+byId);
	}

	// Retrieving all employees of a particular company
		public void getEmployeesByCompany()
		{						
			List<Employee> l = er.findByIdCompanyId("C-1002");			
			l.forEach(System.out::println);
		}
}
