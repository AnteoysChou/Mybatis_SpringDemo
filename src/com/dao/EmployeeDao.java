package com.dao;

import java.util.List;

import com.tianj.demo.common.entity.*;
//�������ݿ��������
public interface EmployeeDao {
	/*
	 * ��ѯ
	 */
	public List<Employee> selectAll();

	public Employee findById(String id);
	
	public Employee findByUserName(String xm);
	
	
	/*
	 * ����ɾ������
	 */
	public int insert(Employee employee);
	
	public int update(Employee employee);
	
	public int delete(String employee);
	
}
