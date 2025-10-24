package com.demo.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.demo.beans.Employee;

public class EmployeedaoImpl implements Employeedao {

	 private Employeedao edao;
	 
	 static List<Employee> elist;
	 static {
		 elist =new ArrayList<>();
	 }

	 @Override
	 public boolean save(Employee e) {         //Adding new Employee
		elist.add(e);
		return true;
	 }
     
	 
	 @Override
	 public List<Employee> findAll() {
		return elist;           //display all the list
	 }


	 @Override
	 public Boolean removeByID(int empId) {
		return elist.remove(new Employee(empId));    // generate empID constructor and generate 
                                                      //equals method to use remove method			 
	 }

	 @Override
	 public List<Employee> sortById() {
		elist.sort(null);          // predefined method
		return elist;
	 }


	 @Override
	 public Employee findByName(String nm) {
		 Optional<Employee> op = elist.stream().filter(e -> e.getEmpName().equalsIgnoreCase(nm)).findFirst();

			if (op.isPresent())
				return op.get();

			return null;
		}


	 @Override
	 public boolean savetoFile() throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("Employee.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oos.writeObject(elist);
		return true;
	 }


	
	 
	 }

