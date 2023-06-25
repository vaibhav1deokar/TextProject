package com.methodofmap;

public class Employee1 {

	float salary;
	String name, dept;

	public Employee1(float salary, String name, String dept) {
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}

	public String toString() {
		return name + " " + dept + " " + salary;
	}

}
