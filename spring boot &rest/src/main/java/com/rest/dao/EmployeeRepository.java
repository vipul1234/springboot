package com.rest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.rest.model.Employee;

import java.util.List;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	Employee findFirstByEmployee(String employee);


    //Supports native JSON query string
    @Query("{employee:'?0'}")
    Employee findCustomByDomain(String employee);

    @Query("{employee: { $regex: ?0 } })")
    List<Employee> findCustomByRegExDomain(String employee);

}
