package com.crudpack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.crudpack.model.EmployeeModel;
import com.crudpack.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@DeleteMapping("/deleteemployeeinfo/{id}")
	public String deleteEmloyeeInfo(@PathVariable int id)
	{
		employeeService.deleteEmployeeById(id);
		return("Employee Data Deleted Successfully....");
	}
	
	@PutMapping("/updateemployeeinfo")
	public String updateEmloyeeInfo(@RequestBody EmployeeModel employeeModel)
	{
		employeeService.updateEmployee(employeeModel);
		return("Employee Data Updated Successfully....");
	}
	
	@GetMapping("/getemployeeinfobyid/{id}")
	public @ResponseBody EmployeeModel getEmployeeById(@PathVariable int id)
	{
		return (employeeService.getEmployeeById(id));
	}
	
	@GetMapping("/getemployeeinfo")
	public @ResponseBody List<EmployeeModel> getEmployee()
	{
		return (employeeService.getAllEmployee());
	}
	
	@PostMapping("/saveemployeeinfo")
	public String saveEmloyeeInfo(@RequestBody EmployeeModel employeeModel)
	{
		employeeService.addEmployee(employeeModel);
		return("Employee Data Saved Successfully....");
	}
}
