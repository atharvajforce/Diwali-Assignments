package com.demo.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

	boolean addStudent();

	Set<Student> displayall();

	void calculateGrade();

	boolean savetoFile() throws IOException;

	boolean readfromFile() throws FileNotFoundException;

}
