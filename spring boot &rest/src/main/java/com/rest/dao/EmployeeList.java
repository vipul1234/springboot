package com.rest.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.rest.model.Employee;

public class EmployeeList {
  List<Employee> employee= new ArrayList<Employee>() ;
  

public List<Employee> getEmployee() {
	Collections.sort(employee);
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}
public void addoneEmployee(Employee oneemployee) {
	employee.add(oneemployee);
	
}
public void deleteoneEmployee(int id) {
	Employee search= new Employee();
	Employee result=null;
	Employee temp;
	
	search.setId(id);
	Iterator<Employee> iterator = employee.iterator();
	while (iterator.hasNext()) {
		temp=iterator.next();	
		if(search.equals(temp))
		{ result= temp;
		 employee.remove(result);
		 break;
		}
}
	}
public Employee returnoneEmployee(int id) {
	Employee search= new Employee();
	Employee result=null;
	Employee temp;
	
	search.setId(id);
	Iterator<Employee> iterator = employee.iterator();
	while (iterator.hasNext()) {
		temp=iterator.next();	
		if(search.equals(temp))
		{ result= temp;
		 employee.remove(result);
		 break;
		}
}
	return result;
	}

public void updateemployee(Employee update_employee) {
	boolean updated=false;
	Employee temp;
	Iterator<Employee> iterator = employee.iterator();
	while (iterator.hasNext()) {
		temp=iterator.next();	
		if(update_employee.equals(temp))
		{ 
			employee.remove(temp);
			employee.add(update_employee);
			updated=true;
			break;
		}
		}
	if(!updated)
	{
		employee.add(update_employee);
	}

	
}
}
