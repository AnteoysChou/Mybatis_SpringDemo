package com.dao;

import java.util.List;

import com.tianj.demo.common.entity.*;
//定义数据库操作函数
public interface EmployeeDao {
	/*
	 * 查询
	 */
	public List<Employee> selectAll();

	public Employee findById(String id);
	
	public Employee findByUserName(String xm);
	
	
	/*
	 * 更新删除插入
	 */
	public int insert(Employee employee);
	
	public int update(Employee employee);
	
	public int delete(String employee);
	
}
