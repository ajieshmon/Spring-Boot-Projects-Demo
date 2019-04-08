package com.crudpack.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.crudpack.model.EmployeeModel;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private  EntityManager entityManager;
	
	@Override
	public void deleteEmployeeById(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		EmployeeModel employeeObj=currentSession.get(EmployeeModel.class,id);
		currentSession.delete(employeeObj);
		
	}
	
	@Override
	public void updateEmployee(EmployeeModel emp) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(emp);
		
	}
	
	@Override
	public EmployeeModel getEmployeeById(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		EmployeeModel employeeObj=currentSession.get(EmployeeModel.class,id);
		return employeeObj;
	}
	
	@Override
	public List<EmployeeModel> getAllEmployee() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<EmployeeModel> query=currentSession.createQuery("from EmployeeModel",EmployeeModel.class);
		List<EmployeeModel> list=query.getResultList();
		return list;
	}

	@Override
	public void addEmployee(EmployeeModel emp) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.save(emp);
	}

	

	

	

	
}
