package com.methodofmap;

import java.util.HashMap;

public class StudentMain {

	void addData(HashMap<Student, Integer> hm) {

		hm.put(new Student(1, "riya", "cs"), 70);
		hm.put(new Student(16, "rahul", "mech"), 70);
		hm.put(new Student(4, "rakesh", "it"), 80);
		hm.put(new Student(3, "ramesh", "cs"), 50);
		hm.put(new Student(56, "rakul", "civil"), 90);
		hm.put(new Student(48, "nayan", "cs"), 40);
		hm.put(new Student(30, "taniya", "mech"), 80);
		hm.put(new Student(9, "saniya", "it"), 70);
		hm.put(new Student(94, "rani", "cs"), 60);
		hm.put(new Student(8, "moni", "civil"), 50);
		
		hm.put(new Student(16, "rahul", "cs"), 70);
		hm.put(new Student(4, "rakesh", "mech"), 80);
		hm.put(new Student(3, "ramesh", "it"), 50);
	}

	void display(HashMap<Student, Integer> hm) {
		System.out.println(hm);
	}

	public static void main(String[] args) {

		HashMap<Student, Integer> hm = new HashMap<>();

		StudentMain obj = new StudentMain();
		obj.addData(hm);
		obj.display(hm);
	}

}
