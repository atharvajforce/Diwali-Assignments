package com.demo.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.dao.Studentdao;
import com.demo.dao.StudentdaoImpl;
import com.demo.exceptions.LessAttendanceException;

public class StudentServiceImpl implements StudentService{

	private Studentdao sdao;
	
 public	StudentServiceImpl()            //service connected to dao
	{
	 sdao =new StudentdaoImpl();	
	}
 
 

 @Override
 public boolean addStudent() {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter Student's Roll no :");
	 int rollno=sc.nextInt();
	 sc.nextLine();   //dummy nextLine 
	
	 System.out.println("Enter Student's Name : ");
     String nm=sc.nextLine();
     
     System.out.println("Enter Course Details :");
     String cr=sc.next();
     
     System.out.println("Enter Students Attendance");
     double att=sc.nextDouble();
     System.out.println("Enter Score : ");
     double scr=sc.nextDouble();
     
     try {
    	if(att<60)
    	throw new LessAttendanceException("Attendance Should be more than 60% ");	
    	Student s=new Student(rollno,nm,cr,att,scr);
   	    return sdao.save(s);
     }catch(LessAttendanceException e)
     {
    	System.out.println("Enter Valid Attendnace, "+e.getMessage()); 
    
//    	e.printStackTrace();
    
     }
	 return false;
     
//     catch(Exception e) {
//    	 System.out.println("Enter Valid Attendance");
//     }       
   
 }



 @Override
 public Set<Student> displayall() {
	// TODO Auto-generated method stub
	return sdao.displayall();
 }



 @Override
 public void calculateGrade() {
	// TODO Auto-generated method stub
	 sdao.calculateGrade();
 }



 @Override
 public boolean savetoFile() throws IOException {
	// TODO Auto-generated method stub
	return sdao.savetoFile();
 }



 @Override
 public boolean readfromFile() throws FileNotFoundException {
	// TODO Auto-generated method stub
	return sdao.readfromFile();
 }
 
 




 
 
}
