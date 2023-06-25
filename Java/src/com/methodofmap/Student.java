package com.methodofmap;

public class Student {

	int id;
	String name, dept;

	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public String toString() {
		return id + " " + name + " " + dept;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.id == s.id) {
			return true;
		} else {
			return false;
		}
	}
}
