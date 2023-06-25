package com.collectionarrayobject;

import java.util.ArrayList;

public class StudentCan1 {
	
	int id ;
	String name,dept;
	ArrayList<Integer> marks;

	public StudentCan1(int id, String name, String dept, ArrayList<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	
	public String toString () {
		return id+" "+name+" "+dept+" "+marks;
	}

}
