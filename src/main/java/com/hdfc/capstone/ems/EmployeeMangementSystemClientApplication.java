package com.hdfc.capstone.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeMangementSystemClientApplication {

	public static void main(String[] args) {
		  System.setProperty("javax.net.ssl.trustStore","D:\\Users\\Chetana  Bachhav\\HDFC\\Employee-Management-System\\src\\main\\resources\\Https.jks");
	        System.setProperty("javax.net.ssl.trustStorePassword","password");
		SpringApplication.run(EmployeeMangementSystemClientApplication.class, args);
	}
	
}
