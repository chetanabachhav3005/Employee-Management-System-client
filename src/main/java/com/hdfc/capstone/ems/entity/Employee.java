package com.hdfc.capstone.ems.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString


public class Employee {
	
	
	private int employeeID;
	
	
	
	private String employeeName;
	
	
	private LocalDate dateOfBirth;
}
