package arrayobject;

import java.util.Scanner;

public class EmployeeMain {
	Scanner sc = new Scanner(System.in);

	Employee emp[] = new Employee[3];

	void addEmpData() {
		for (int i = 0; i < 3; i++) {

			System.out.println("Enter id, name, dept, salary : ");
			int id = sc.nextInt();

			sc.nextLine();
			String name = sc.nextLine();
			String dept = sc.next();
			double salary = sc.nextDouble();

			Employee e = new Employee(id, salary, name, dept);
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);

			emp[i] = e;
		}
	}

	void display() {

		for (Employee em : emp) {

			if (em != null) {
				System.out.println(em.getId() + " " + em.getName() + " " + em.getDept() + " " + em.getSalary());
			}
		}

		System.out.println();
	}

	void searchEmployeeData() {
		System.out.println("Enter Employee id : ");
		int id = sc.nextInt();

		for (Employee em : emp) {
			if (em != null) {
				if (em.getId() == id) {
					System.out.println(em);
				}
			}
		}
	}

	public static void main(String[] args) {

		EmployeeMain em = new EmployeeMain();
		em.addEmpData();
		em.searchEmployeeData();
		em.display();

	}

}
