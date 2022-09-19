package com.greatlearning;

import com.greatlearning.model.Student;

public class DriverClass {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.acceptStudent();
		s2.acceptStudent();
		s3.acceptStudent();
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
	}

}
