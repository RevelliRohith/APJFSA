package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DemoStudent implements Comparable<DemoStudent>{

	int studentId;
	String studentName;
	String qualification;
	
	
	public DemoStudent(int studentId, String studentName, String i) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualification = i;
	}
	
	@Override
	public String toString() {
		return "DemoStudent [studentId=" + studentId + ", studentName=" + studentName + ", qualification=" + qualification
				+ "]";
	}
	
	public int compareTo1(DemoStudent o) {
		if(this.studentName.compareTo(o.studentName)<0)
			return -1;
		else if(this.studentName.compareTo(o.studentName)>0)
			return 1;
		else
			return 0;
	}

	

	@Override
	public int compareTo(DemoStudent o) {
		// TODO Auto-generated method stub
		return 0;
	}


	}


class StudentCollection12 {

	public static void main(String[] args) {
		List<DemoStudent> list=new ArrayList<DemoStudent>();	


list.add(new DemoStudent(124,"Deepa","BSc"));
list.add(new DemoStudent(211,"Arya","Bcom"));
list.add(new DemoStudent(100,"Sam","Btech"));
list.add(new DemoStudent(432,"Divya","BE"));

DemoStudent s=new DemoStudent(411,"Fizal","Bsc");
list.add(s);
for(DemoStudent s1:list) {
	System.out.println(s1);
}
Collections.sort(list);
for(DemoStudent s1:list) {
	System.out.println(s1);
}
}
}
