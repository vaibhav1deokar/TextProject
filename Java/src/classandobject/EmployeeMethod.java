package classandobject;

import java.util.Scanner;

public class EmployeeMethod {

	int id;
	String name, dept, contact;
	double salary;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, Name, Dept, Contact, Salary");

		int i = sc.nextInt();
		String n = sc.next();
		String d = sc.next();
		String c = sc.next();
		double s = sc.nextDouble();

		id = i;
		name = n;
		dept = d;
		contact = c;
		salary = s;

		sc.close();
	}
	

	void display() {

		System.out.println(id+" " + name +" " + dept+" " + contact+" " + salary);
	}

}
