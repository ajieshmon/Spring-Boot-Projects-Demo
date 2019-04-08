package com.crudpack.service;

import java.util.List;

import com.crudpack.model.EmployeeModel;

public interface EmployeeService {
	public void addEmployee(EmployeeModel emp);
	public List<EmployeeModel> getAllEmployee();
	public EmployeeModel getEmployeeById(int id);
	public void updateEmployee(EmployeeModel emp);
	public void deleteEmployeeById(int id);
}
