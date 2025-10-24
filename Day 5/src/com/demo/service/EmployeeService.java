package com.demo.service;

import java.io.IOException;
import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean AddnewEmployee();

	List<Employee> displayAll();

	Boolean removeByID(int empId);

	List<Employee> sortById();

	Employee findByName(String nm);

	boolean savetoFile() throws IOException;

}
