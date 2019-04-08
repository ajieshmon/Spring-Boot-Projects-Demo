package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Customer;
import com.crud.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@DeleteMapping("/deletecustomerinfo/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		return(customerService.deleteCustomer(id));
	}
	
	@PutMapping("/updatecustomerinfo")
	public String updateCustomer(@RequestBody Customer customer)
	{
		return (customerService.updateCustomer(customer));
		
	}
	
	@GetMapping("/getsinglecustomerinfo/{id}")
	public @ResponseBody Customer getSingleCustomer(@PathVariable int id)
	{
		return(customerService.getSingleCustomer(id));
	}
	
	@RequestMapping(value="/getcustomerinfo")
	public @ResponseBody List<Customer> getAllCustomer()
	{
		return(customerService.getAllCustomer());
	}
	
	@PostMapping("/savecustomerinfo")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		return (customerService.saveCustomer(customer));
		
	}
}
