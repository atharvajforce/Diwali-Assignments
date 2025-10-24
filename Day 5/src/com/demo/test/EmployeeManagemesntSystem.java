package com.demo.test;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeManagemesntSystem {

	public static void main(String[] args) throws IOException {
  
	  Scanner sc=new Scanner(System.in);
       EmployeeService eservice=new EmployeeServiceImpl();
      // List<Employee> elist =new ArrayList<>();   not necessary here declared in service layer
       int choice =0;
       do {System.out.println("-------Employee Management System-------");
           System.out.println("1. Add new Employee\n2. Remove Employee\n3. Show All Employee");
           System.out.println("4. Show Employee in Sorted Order\n5. Find Employee By Name\n6. Save All Employees in File");
           System.out.println("7. Quit\n Choice :");
   
           choice =sc.nextInt();
           switch(choice) {
           case 1->{
        	  boolean status= eservice.AddnewEmployee();
        	  if(status)
        		  System.out.println("Employee Added Succesfully");
        	  else
        		  System.out.println("Failed to Add New Employee ");
        	  
           }
           case 2->{
        	   System.out.println("Enter Employee's Id : ");
        	   int empId=sc.nextInt();
        	   Boolean status =eservice.removeByID(empId);
        	   if(status)
        		   System.out.println("Deleted Successfully");
        	   else
        		   System.out.println("Not Found");
        	   
           }
           case 3->{
        	  List<Employee> elist=eservice.displayAll();
        	  elist.forEach(System.out::println);
           }
           case 4->{
        	 List<Employee> elist=eservice.sortById();
        	 elist.forEach(System.out::println);
        	 
           }
           case 5->{
        	 System.out.println("Enter Employee's Name : ");
        	 String nm=sc.next();
        	 Employee e=eservice.findByName(nm);
        	 if (e != null) {
        		    System.out.println("Employee Found!");
        		    System.out.println("ID: " + e.getEmpId());
        		    System.out.println("Name: " + e.getEmpName());
        		    System.out.println("Role: " + e.getEmpRole());
        		} else {
        		    System.out.println("Employee not found!");
        		}
        	
        	
           }
           case 6->{
        	   boolean status =eservice.savetoFile();
        	   if(status)
        	   {
        		 System.out.println("Saved Succesfully ");  
        	   }
        	   else {
        		  System.out.println("Somethign went Wrong..."); 
        	   }
           }
           
           case 7->{
        	   System.out.println("Thank You for Vising......");
           }
           
           default->{
           	System.out.println("Wrong Choice , Select Correct one!");
           }     
           }
         
       }
       while(choice!=7);
       
       
       
	}

}
