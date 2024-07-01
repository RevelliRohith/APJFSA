package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollection {

	public static void main(String[] args) {
		//object creation
	List<Student> list=new ArrayList<Student>();
	//to add the list 
	list.add(new Student(123,"rohi",21));
	list.add(new Student(124,"ravi",42));
	list.add(new Student(155,"yogi",86));
	
	Student s=new Student(122,"ramu",86);
	
	list.add(s);
	for(Student s1 : list) {
		
		//print statement
		System.out.println(s1);
		
	}
	//sort statement
	Collections.sort(list);
	//for loop to repeat the print statement
	for(Student s1:list) {
		System.out.println(s1);
	}
	

	}

}
