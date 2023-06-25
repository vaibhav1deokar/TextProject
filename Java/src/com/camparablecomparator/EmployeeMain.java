package com.camparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	
	void addData(ArrayList<Employee>emp) {

		emp.add(new Employee(101, "Rahul", "seles", 80000));
		emp.add(new Employee(10, "Rakesh", "HR", 90000));
		emp.add(new Employee(11, "kapil", "Design", 100000));
		emp.add(new Employee(105, "sumit", "Devlopment", 70000));
		emp.add(new Employee(106, "pratik", "Hr", 50000));
		emp.add(new Employee(181, "shubham", "Design", 90000));
		emp.add(new Employee(153, "ramesh", "BA", 80000));
		emp.add(new Employee(195, "tushar", "Maintance", 60000));
		emp.add(new Employee(201, "bhushan", "seles", 70000));
		emp.add(new Employee(601, "prashant", "seles", 80000));
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee>emp = new ArrayList<>();

		EmployeeMain obj = new EmployeeMain();
		obj.addData(emp);
		
		Collections.sort(emp);
		System.out.println(emp);
		
	}

}
