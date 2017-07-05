package com.rest.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Employee")
public class Employee implements Comparable<Employee>{
 
	
    public Employee() {
         
    }
    public Employee(Integer id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
     
   
    private Integer id;
    
  
    private String firstName;
    
   
    private String lastName;
    
   
    private String email;
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (id == null || obj == null || getClass() != obj.getClass())
			return false;
		Employee toCompare = (Employee) obj;
		return id.equals(toCompare.id);
	}

	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}
	@Override
	public int compareTo(Employee emp) {
		return this.id-emp.id;
	}
}