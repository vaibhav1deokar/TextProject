package com.methodofmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import com.collectionarrayobject.Employee;

public class CountMapExample {

	void displayNames() {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(5, "meena");
		hm.put(2, "reena");
		hm.put(3, "tina");
		hm.put(4, "shila");
		hm.put(8, "nila");

//		for (String s : hm.values()) {
//			if (s.startsWith("r")) {
//				System.out.println(s);
//			}
//		}
//		for (Integer i : hm.keySet()) {
//			if (hm.get(i).startsWith("r")) {
//				System.out.println(i + " " + hm.get(i));
//			}
//		}
		for (Map.Entry<Integer, String> mp : hm.entrySet()) {
			if (mp.getValue().startsWith("r")) {
				System.out.println(mp.getKey() + " " + mp.getValue());
			}
		}
	}

	void arrayToMap() {
		ArrayList<String> a1 = new ArrayList<>();

		a1.add("reena");
		a1.add("Meena");
		a1.add("tina");
		a1.add("sanjay");
		a1.add("reena");
		a1.add("Meena");
		a1.add("tina");

		HashMap<String, Integer> hm = new HashMap<>();

//		System.out.println(a1);

		for (String s : a1) {
			if (hm.containsKey(s)) {
				int x = hm.get(s);
				x = x + 1;
				hm.put(s, x);
			} else {
				hm.put(s, 1);
			}
		}
		System.out.println(hm);

	}

	void employeeArrayListToMap() {

		ArrayList<Employee> emp = new ArrayList<>();

		emp.add(new Employee(101, "Rahul", "seles", 80000));
		emp.add(new Employee(10, "Rakesh", "HR", 90000));
		emp.add(new Employee(11, "kapil", "Design", 100000));
		emp.add(new Employee(105, "sumit", "Devlopment", 70000));
		emp.add(new Employee(106, "pratik", "HR", 50000));
		emp.add(new Employee(181, "shubham", "Design", 90000));
		emp.add(new Employee(153, "ramesh", "BA", 80000));
		emp.add(new Employee(195, "tushar", "Maintance", 60000));
		emp.add(new Employee(201, "bhushan", "seles", 70000));
		emp.add(new Employee(601, "prashant", "seles", 80000));

		HashMap<String, Integer> hm = new HashMap<>();

		for (Employee e : emp) {
			String d = e.dept;
			if (hm.containsKey(d)) {
				int x = hm.get(d);
				x = x + 1;
				hm.put(d, x);
			} else {
				hm.put(d, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {

		CountMapExample obj = new CountMapExample();
//		obj.displayNames();
//		obj.arrayToMap();
		obj.employeeArrayListToMap();
	}
}
