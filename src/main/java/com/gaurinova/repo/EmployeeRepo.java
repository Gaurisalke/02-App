package com.gaurinova.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurinova.entity.Employee;
import com.gaurinova.entity.EmployeeIdentity;

public interface EmployeeRepo extends JpaRepository<Employee, EmployeeIdentity>{
	
	List<Employee> findByIdCompanyId(String companyId);

}
