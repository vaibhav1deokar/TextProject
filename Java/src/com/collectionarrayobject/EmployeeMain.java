package com.collectionarrayobject;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeMain {

	ArrayList<Employee> emp = new ArrayList<>();

	void addData() {
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

	void display() {
		System.out.println(emp);
//		for (Employee e : emp) {
//			if (e.salary > 10000 && e.dept.equalsIgnoreCase("Design")) {
//				System.out.println(e);
//			}
//		}
		System.out.println();
	}
	

	void search(int id) {
		for (Employee e : emp) {
			if (e.id == id) {
				System.out.println(e);
			}
		}
		System.out.println();
	}

	void deleteEmp(int id) {
		int index;
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).id == id) {
				index = i;

//				ListIterator<Employee>litr = emp.listIterator();
//				while (litr.hasNext()) {
//					Employee e = litr.next();
//					if(e.id==id) {
//						litr.remove();
//					}
			}
		}
		System.out.println();
	}
	
	void updateEmp(int id) {
		int salary1 = 2000;
		for(Employee e : emp) {
			if(e.id==id) {
				e.salary = salary1;
			}
		}
	}

	public static void main(String[] args) {

		EmployeeMain obj = new EmployeeMain();

		obj.addData();
		obj.updateEmp(101);
		obj.display();
//		obj.search(101);
//		obj.deleteEmp(101);
//		obj.display();

	}

}
