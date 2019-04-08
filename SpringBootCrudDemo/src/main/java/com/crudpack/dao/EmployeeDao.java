package com.crudpack.dao;

import java.util.List;

import com.crudpack.model.EmployeeModel;

public interface EmployeeDao {
	public void addEmployee(EmployeeModel emp);
	public List<EmployeeModel> getAllEmployee();
	public EmployeeModel getEmployeeById(int id);
	public void updateEmployee(EmployeeModel emp);
	public void deleteEmployeeById(int id);

}
