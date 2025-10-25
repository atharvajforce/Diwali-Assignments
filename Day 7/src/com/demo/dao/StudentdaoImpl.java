package com.demo.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Student;

public class StudentdaoImpl implements Studentdao {

	static Set<Student> treeset;
	static {
		treeset = new TreeSet<>();
	}
	
	
	@Override
	public boolean save(Student s) {
		treeset.add(s);		
		return true;
	}


	@Override
	public Set<Student> displayall() {
		
		return treeset;
	}


	@Override
	public void calculateGrade() {
		
		for(Student s: treeset)
		{
			s.CalculateGrade();
		}
	}


	@Override
	public boolean savetoFile() throws IOException {      //Serialization
		
		 try (FileOutputStream fos = new FileOutputStream("Student.txt");
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            oos.writeObject(treeset);
	            System.out.println("Serialization complete. Data written to Student.txt.");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 return true;
	}


	@Override
	public boolean readfromFile() throws FileNotFoundException {  // de-Serialization
		try (FileInputStream fis = new FileInputStream("Student.txt");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {

	            Set<Student> readStudents = (TreeSet<Student>) ois.readObject();
	            System.out.println("Deserialization complete. Data read from Student.txt:\n");

	            // Step 4: Display all students
	            for (Student s : readStudents) {
	                System.out.println(s);
	            }

	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

		
		return true;
	}
	
	

	
}
