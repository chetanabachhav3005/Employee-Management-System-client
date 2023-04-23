package com.hdfc.capstone.ems.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.capstone.ems.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	private static final Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	  private RestTemplate restTemplate;

	  public EmployeeServiceImpl(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }
	
	@Override
	public Employee getEmployeeById(int employeeId){
		
		ResponseEntity<Employee>  response =	restTemplate.getForEntity("https://localhost:8888/api/get/"+employeeId, Employee.class);
		
		Employee emp= response.getBody();
		
return emp;	
			
	}

}