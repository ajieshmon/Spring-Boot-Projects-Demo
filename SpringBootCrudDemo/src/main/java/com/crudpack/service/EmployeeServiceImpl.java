package com.crudpack.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crudpack.dao.EmployeeDao;
import com.crudpack.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public void deleteEmployeeById(int id) {
		employeeDao.deleteEmployeeById(id);	
	}
	
	@Override
	@Transactional
	public void updateEmployee(EmployeeModel emp) {
		employeeDao.updateEmployee(emp);	
	}
	
	@Override
	@Transactional
	public EmployeeModel getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return (employeeDao.getEmployeeById(id));
	}
	
	@Override
	@Transactional
	public List<EmployeeModel> getAllEmployee() {
		return (employeeDao.getAllEmployee());
	}

	@Override
	@Transactional
	public void addEmployee(EmployeeModel emp) {
		employeeDao.addEmployee(emp);
		
	}

}
