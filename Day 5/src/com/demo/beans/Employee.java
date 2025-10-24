package com.demo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Comparable<Employee> ,Serializable{      // implements comparable method for comparison
	
private int empId;
private String empName;
private String empRole;

public Employee() {      //default Constructor
	super();
}

public Employee( int empId,String empName, String empRole) {   // parameterized constructor
	super();
	this.empId = empId;
	this.empName = empName;
	this.empRole = empRole;
}


public Employee( int empId ,String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empRole="Employee";            //hardcoded emp role
}


public Employee(int empId) {
	super();
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getEmpRole() {
	return empRole;
}


public void setEmpRole(String empRole) {
	this.empRole = empRole;
}


@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
}

@Override
public int hashCode() {
	return Objects.hash(empId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empId == other.empId;
}

@Override
public int compareTo(Employee o) {        // Compulsory for Comparing 
	return this.empId -o.empId;
}








	
}
