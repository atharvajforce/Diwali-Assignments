package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable ,Comparable<Student> {

private int rollno;
private String sname;
private String course;
private double attendance_percentage;
private double score;

public Student() {   //default constructor
	super();
}

public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
	super();             //Parameterized Constructor
	this.rollno = rollno;
	this.sname = sname;
	this.course = course;
	this.attendance_percentage = attendance_percentage;
	this.score = score;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public double getAttendance_percentage() {
	return attendance_percentage;
}

public double getScore() {
	return score;
}


@Override
public String toString() {
	return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", attendance_percentage="
			+ attendance_percentage + ", score=" + score + "]";
}

public void CalculateGrade()
{
  if(score>=90)
	  System.out.println("A+ Grade");
  else if(score>=80)
	  System.out.println("A Grade");
  else if(score>=70)
	  System.out.println("B+ Grade");
  else if(score>=60)
	  System.out.println("B Grade");
  else if(score>=50)
	  System.out.println("C grade");
  else if(score>=40)
	  System.out.println("Passed ");
  else
	  System.out.println("You have Failed");
}

@Override
public int compareTo(Student o) {
	if((int)this.getAttendance_percentage()-o.getAttendance_percentage()==0)
	{
		return o.getRollno()-this.getRollno();
	}
	return (int) (o.getAttendance_percentage()-this.getAttendance_percentage());
	
}


}
