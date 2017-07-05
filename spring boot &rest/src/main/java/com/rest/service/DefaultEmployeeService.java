package com.rest.service;

import java.util.List;

import com.rest.model.Employee;

public interface DefaultEmployeeService {
	
	public  void save(Employee emp);
	
	public List<Employee> getAll();
	
	public Employee getById(Integer id);
	
	public void delete(Integer id);
	
	public Employee update(Integer id);
}
