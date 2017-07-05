package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Employee;
import com.rest.serviceImpl.EmployeeService;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		empService.save(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = empService.getAll();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Integer id) {
		empService.delete(id);
		return new ResponseEntity<Void>(HttpStatus.GONE);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id) {
	Employee emp=empService.getById(id);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Employee> updateEmployee(
			@RequestBody Employee employee) {
		Employee emp = empService.update(employee.getId());
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
}
