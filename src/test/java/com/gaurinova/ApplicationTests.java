package com.gaurinova;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gaurinova.entity.Employee;
import com.gaurinova.repo.EmployeeRepo;

@SpringBootTest
public class ApplicationTests {
	@Autowired	
	private EmployeeRepo er;	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void fetchRecordTest()
	{
			List<Employee> l = er.findByIdCompanyId("C-1002");			
			l.forEach(System.out::println);
		
	}

}
