package com.methodofmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

	HashMap<Integer, Employee1> hm = new HashMap<>();

	void addData(HashMap<Integer, Employee1> hm) {

		hm.put(120, new Employee1(50000, "raj", "Hr"));
		hm.put(128, new Employee1(30000, "raj", "Design"));
		hm.put(123, new Employee1(90000, "raj", "Hr"));
		hm.put(124, new Employee1(40000, "raj", "Design"));
		hm.put(126, new Employee1(10000, "raj", "Maintance"));
		hm.put(121, new Employee1(90000, "raj", "BA"));
		hm.put(15, new Employee1(80000, "raj", "Hr"));
		hm.put(160, new Employee1(30000, "raj", "Maintance"));
		hm.put(170, new Employee1(10000, "raj", "Design"));
		hm.put(130, new Employee1(70000, "raj", "Devloper"));
		hm.put(190, new Employee1(40000, "raj", "Devloper"));
		hm.put(69, new Employee1(60000, "raj", "Customer Support"));
		hm.put(37, new Employee1(50000, "raj", "Hr"));
		hm.put(91, new Employee1(40000, "raj", "Devloper"));

	}

//	void display(HashMap<Integer, Employee1> hm) {
//		System.out.println(hm);
//	}

	void display(HashMap<Integer, Employee1> hm) {

		for (Map.Entry<Integer, Employee1> map : hm.entrySet()) {
//			System.out.println();
//			if(map.getValue().dept.equalsIgnoreCase("hr") && map.getValue().salary>50000) {
//				System.out.println(map.getKey()+" "+map.getValue());
//			}

			float sal = map.getValue().salary;

			if (map.getValue().dept.equalsIgnoreCase("hr")) {
				sal = sal + sal * 0.15f;
				map.getValue().salary = sal;
			}

		}
		System.out.println(hm);
	}

	public static void main(String[] args) {

		HashMap<Integer, Employee1> hm = new HashMap<>();

		EmployeeHashMap obj = new EmployeeHashMap();
		obj.addData(hm);
		obj.display(hm);
	}

}
