package arraysobjectsass;

import java.util.Arrays;
import java.util.Scanner;

import arrayobject.Employee;

public class EmployeeMain {
	Scanner sc = new Scanner(System.in);
	Employee em[] = new Employee[4];

	void employeeData() {

		em[0] = new Employee(123, 500000, "vivek", "mech");
		em[1] = new Employee(456, 600000, "raju", "cs");
		em[2] = new Employee(789, 900000, "ravi", "it");
		em[3] = new Employee(654, 400000, "rahul", "civil");

	}

	void displayData() {

		System.out.println(Arrays.toString(em));
	}

	void searchData() {
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		for (Employee e : em) {
			if (e.id == id) {
				System.out.println(e);
			}
		}
	}

	void updateData() {

		System.out.println("enter the id:");
		int id = sc.nextInt();
		System.out.println("what do you want to update:(salary)");
		String data = sc.next();
		if (data.equalsIgnoreCase("salary")) {
			System.out.println("enter the updated salary:");
			int salary = sc.nextInt();
			for (Employee e : em) {
				if (e != null) {
					if (e.id == id) {
						e.salary = salary;
					}
				}
			}
		}
	}

	void deleteData() {
		System.out.println("Enter id");
		int id = sc.nextInt();

		for (int i = 0; i < em.length; i++) {
			if (em[i] != null) {
				if (em[i].id == id) {
					em[i] = null;
//					break;
				}
			}
		}
	}

//	void displayData() {
//
//		System.out.println(Arrays.toString(em));
//	}

	public static void main(String[] args) {

		EmployeeMain obj = new EmployeeMain();

		obj.employeeData();
		obj.searchData();
		obj.updateData();
		obj.deleteData();
		obj.displayData();
	}

}
