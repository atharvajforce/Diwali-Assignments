package com.demo.dao;

import java.io.IOException;
import java.util.List;

import com.demo.beans.Employee;

public interface Employeedao {

	boolean save(Employee e);

	List<Employee> findAll();

	Boolean removeByID(int empId);

	List<Employee> sortById();

	Employee findByName(String nm);

	boolean savetoFile() throws IOException;

}
