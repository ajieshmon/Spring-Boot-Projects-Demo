package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_tbl")
public class Customer {
	
	@Id
	@Column(name="CustomerId")
	private int customeId;
	@Column(name="CustomerName")
	private String customerName;
	@Column(name="mobileNumber")
	private String contact;
	@Column(name="Salary")
	private double customerSalary;
	
	//Generate Getters and Setters
	
	public int getCustomeId() {
		return customeId;
	}
	public void setCustomeId(int customeId) {
		this.customeId = customeId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getCustomerSalary() {
		return customerSalary;
	}
	public void setCustomerSalary(double customerSalary) {
		this.customerSalary = customerSalary;
	}
	
	
	

}
