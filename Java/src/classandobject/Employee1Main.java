package classandobject;

import java.util.Scanner;

public class Employee1Main {

	public static void main(String[] args) {

		Employee1Method e1 = new Employee1Method();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, Name, Dept, Contact, Salary:");
		int i = sc.nextInt();
		String n = sc.next();
		String d = sc.next();
		String c = sc.next();
		double s = sc.nextDouble();
		
		e1.setingData(i, n, c, d, s);
		
		System.out.println("----------------------");
		
		Employee1Method e2 = new Employee1Method();
		
		System.out.println("Enter id, Name, Dept, Contact, Salary:");
		i = sc.nextInt();
		n = sc.next();
		d = sc.next();
		c = sc.next();
		s = sc.nextDouble();
		
		e2.setingData(i, n, c, d, s);
		
		System.out.println("-----------------------");
		
		e1.display();
		e2.display();
		
		sc.close();
	}

}
