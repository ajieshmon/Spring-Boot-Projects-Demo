package com.crudpack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_tbl")
public class EmployeeModel {
	
	@Id
	@Column(name="empId")
	private int empId;
	@Column(name="empName",nullable=false)
	private String empName;
	@Column(name="designation",nullable=false)
	private String desigantion;
	@Column(name="salary",nullable=false)
	private double salary;
	
	//getters and Setters
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesigantion() {
		return desigantion;
	}
	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
