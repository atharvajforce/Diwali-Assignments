package com.demo.test;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class StudentManagementSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StudentService sservice=new StudentServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {System.out.println("-----Student Management System-----");
		    System.out.println("1. Add Student\n2. Display All Students\n3. Calculate Grade\n4. Save to File\n5. Retrive from file ");
		    System.out.println("6. Exit\n  Choice : ");
            choice=sc.nextInt();
		    switch(choice)
           {
           case 1->{
        	  boolean status= sservice.addStudent();
        	  if(status)
        		  System.out.println("Student Added Succesfully");
        	  else
        		  System.out.println("Something Went Wrong");
           }
           case 2->{
        	  Set<Student> lst=sservice.displayall();
        	  for(Student s:lst)
        		  	System.out.println(s);
           }
           case 3->{
        	   sservice.calculateGrade();
           }
           case 4->{
        	   boolean status=sservice.savetoFile();
        	   if(status)
        		System.out.println("Saved Succesfully");
        	   else
        		  System.out.println("Error to save file"); 
           }
           case 5->{
        	       boolean status=sservice.readfromFile();
        	    		   if(status)
        	    			   System.out.println("Opened Succesfully");
        	    		   else
        	    			   System.out.println("Error File not exist");
           }
           case 6->{
        	   System.out.println("Thank you for Visiting....");
        	   sc.close();
           }
            
           }
		}
        while(choice!=6);
	}

}
