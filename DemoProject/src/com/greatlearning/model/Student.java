package com.greatlearning.model;
import java.util.Scanner;
public class Student {
	private int rno;
	private String sname;
	private double percentage;
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rno");
		rno=sc.nextInt();
		System.out.println("Enter Sname");
		sname=sc.next();
		System.out.println("Enter Percentage");
		percentage=sc.nextDouble();
		
	}
	public void displayStudent()
	{
		System.out.println("Roll no is "+rno);
		System.out.println("Name is "+sname);
		System.out.println("Percentage is "+percentage);
		
	}
	
	

}
