package com.hdfc.capstone.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.service.IEmployeeService;

@RestController
@RequestMapping("/api/resttemplate")
public class EmployeeRestTemplate {

	@Autowired
	IEmployeeService service;

	@GetMapping("/get/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) {
		return service.getEmployeeById(employeeId);
	}
	
}
