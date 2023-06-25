package com.camparablecomparator;

//import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	int id, salary;
	String name, dept;

	public Employee(int id, String name, String dept, int salary) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + salary;
	}

//	@Override
	public int compareTo(Employee e) {
		

//		if (this.id > e.id) { // acendeing order.....
//			return 1;
//		} else if (this.id < e.id) {
//			return -1;
//		} else {
//			return 0;
//		}

//		if(this.id>e.id) {    //dec order
//			return -1;
//		}
//		else if(this.id<e.id) {
//			return 1;
//		}
//		else {
//			return 0;
//		}

		return this.name.compareTo(e.name);  //name asending...

		// salary..(asc..)

//		if(this.salary>e.salary) {  // salary asending...
//			return 1;
//		}
//		else if(this.salary<e.salary) {
//			return -1;
//		}else {
//			return 0;
//		}

		// salary..then name (asc..)

//		if (this.salary > e.salary) { // salary then name asending...
//			return 1;
//		} else if (this.salary < e.salary) {
//			return -1;
//		} else {
//			return this.name.compareTo(e.name);
//		}
		
		//dept first then salary then id ...
		
//		if(this.dept.compareTo(e.dept)==0){
//			if(this.salary>e.salary) {
//				return 1;
//			}else if(this.salary<e.salary) {
//				return-1;
//			}else {
//				return this.id-e.id;  // shortcut..
//				if(this.id>e.id) {    // long method..
//					return 1;
//				}else if(this.id<e.id) {
//					return -1;
//				}else {
//					return 0;
//				}
//				else {
//					return this.dept.compareTo(e.dept);
//					
//				}
			}
}


	
