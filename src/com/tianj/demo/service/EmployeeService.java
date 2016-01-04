package com.tianj.demo.service;

import java.util.List;

import com.tianj.demo.common.entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();
	
	//²é
	public Employee getEmployeeInfo(String ID,String xm);
	
	//ÔöÉ¾¸Ä
	public int insertEmployee(Employee user);
	public int updateEmployee(Employee user);
	
	public int deleteEmployee(String ID);
}
