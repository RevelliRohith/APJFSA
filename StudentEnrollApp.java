package com.Exception;

import java.util.Scanner;

public class StudentEnrollApp {
	//we enroll the student only if the students income is less than 500000 
	//and they must be completed the degree 
	
	void enroll(int income,String status) {
		if(income >500000)
			//if the income is greater than 5lakh then it throw arithmetic
			
			throw new ArithmeticException();
		
		//if the income less than 5lakh it throw nullpointer exception
	//if the student degree not completed it goes to elseif then we give no so status having no 
		//this goes to try block and catch black and print the output
		else if(status.equalsIgnoreCase("no"))
			throw new NullPointerException();
		
		//printing 
		System.out.println("Student Enrolled into the Batch");
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Object creation
		StudentEnrollApp student=new StudentEnrollApp();
		
		System.out.println("Enter Annul Income:");
		
		int income=sc.nextInt();
		System.out.println("Is your degree completed?:yes/no:");
		String status=sc.next();
		
		try {
			student.enroll(income, status);
		}catch(Exception e) {
			
		
			System.out.println("You are not eligible for the enrollment");
		}
		
		
	}

}
