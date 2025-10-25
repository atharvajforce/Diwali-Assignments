package com.demo.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import com.demo.beans.Student;

public interface Studentdao {

	boolean save(Student s);

	Set<Student> displayall();

	void calculateGrade();

	boolean savetoFile() throws IOException;

	boolean readfromFile() throws FileNotFoundException;

}
