package com.crud.service;

import java.util.List;
import com.crud.model.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getSingleCustomer(int id);
	public String updateCustomer(Customer customer);
	public String deleteCustomer(int id);

}
