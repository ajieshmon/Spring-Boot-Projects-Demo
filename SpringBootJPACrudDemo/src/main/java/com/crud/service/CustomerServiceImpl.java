package com.crud.service;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Customer;
import com.crud.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	@Transactional
	public String deleteCustomer(int id) {
		String responseMsg="Data has benn Not Deleted";
		Customer c=customerRepository.findById(id).orElse(null);
		if(c != null)
		{
			customerRepository.delete(c);
			responseMsg="Data has benn deleted successfully..";
		}
		return (responseMsg);
	}
	
	@Override
	@Transactional
	public String updateCustomer(Customer customer) {
		String responseMsg="Data has benn Not Updated";
		if(customer.getCustomeId()!= 0)
		{
			Customer c=customerRepository.findById(customer.getCustomeId()).orElse(null);
			if(c != null)
			{
				customerRepository.save(customer);
				responseMsg="Data has benn  Updated successfully..";
			}
		}
		return (responseMsg);
	}
	
	@Override
	@Transactional
	public Customer getSingleCustomer(int id) {
		return(customerRepository.findById(id).orElse(null));
	}
	
	@Override
	@Transactional
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
	
	@Override
	@Transactional
	public Customer saveCustomer(Customer customer) {
		return (customerRepository.save(customer));
	}
}
