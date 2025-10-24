package com.demo.service;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.Employeedao;
import com.demo.dao.EmployeedaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private Employeedao edao;      // Variable declaration
	
	public EmployeeServiceImpl()
	{
		edao=new EmployeedaoImpl();    // new object creation 
	}

	@Override
	public boolean AddnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee's Id :  ");
        int empId=sc.nextInt();
		System.out.println("Enter Employee's Name : ");
        String empName=sc.next();
        System.out.println("Enter Employee's Role : ");
        String empRole=sc.next();
        Employee e=new Employee(empId,empName,empRole);
		return edao.save(e);
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public Boolean removeByID(int empId) {
		return edao.removeByID(empId);
	}

	@Override
	public List<Employee> sortById() {
		return edao.sortById();
	}

	@Override
	public Employee findByName(String nm) {
		return edao.findByName(nm);
	}

	@Override
	public boolean savetoFile() throws IOException {
		return edao.savetoFile();
	}


		
	
	
	
	
	
	
	
	}

