package com.rest.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.dao.EmployeeList;
import com.rest.model.Employee;
import com.rest.service.DefaultEmployeeService;

@Service
public class EmployeeService implements DefaultEmployeeService {
	
EmployeeList elist = new EmployeeList();
	

	public  void save(Employee emp)
	{
		elist.addoneEmployee(emp);
		}

	@Override
public List<Employee> getAll()
{
		return elist.getEmployee();
	}
	
	@Override
public Employee getById(Integer id)
{
		return elist.returnoneEmployee(id);
	
	}

	@Override
public void delete(Integer id) {
		
		elist.deleteoneEmployee(id);
	
}
	
	@Override
public Employee update(Integer id) {
		
		Employee emp= elist.returnoneEmployee(id);
		if(emp!=null)
		{
			elist.addoneEmployee(emp);
	}
	return emp;	
	
}

	
}
