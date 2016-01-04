package com.tianj.demo.service.shixianlei;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.tianj.demo.common.entity.Employee;
import com.tianj.demo.service.*;
/**
 * @author Administrator
 *
 */
@Service("userService")
public class EmployeeServiceShiXian implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	/*
	@Autowired
	private SqlSessionTemplate sessionTemplate;*/
	

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.selectAll();
		
	}

	@Override
	public Employee getEmployeeInfo(String ID, String xm) {
		// TODO Auto-generated method stub
		if(ID!=null){
			return employeeDao.findById(ID);
		}
		else
			return employeeDao.findByUserName(xm);
	}

	@Override
	public int insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
			return employeeDao.insert(employee);
	}
	
	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
			return employeeDao.update(employee);
	}

	@Override
	public int deleteEmployee(String ID) {
		// TODO Auto-generated method stub
		return employeeDao.delete(ID);
	}
	
	
}
