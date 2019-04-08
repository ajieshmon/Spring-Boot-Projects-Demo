package com.threeedge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeedge.model.Customer;

@RestController
public class SpringBootController {
	@RequestMapping("/")
	public String welcome() {
		return("Welcome to Spring Boot restfull service Demo");
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return("Hello Spring Boot");
	}
	
	@RequestMapping("/getcustomerinfo")
	public Customer customerInformation() {
		Customer cust = new Customer();

        cust.setCustNo(100);
        cust.setName("3Edge Solution");
        cust.setCountry("Chennai");
		return cust;
		
	}
}
