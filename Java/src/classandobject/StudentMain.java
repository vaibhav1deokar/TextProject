package classandobject;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		StudentMethod s1 = new StudentMethod();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, Name, email, std, marks in %:");
		int i = sc.nextInt();
		String n = sc.next();
		String e = sc.next();
		String s = sc.next();
		double m = sc.nextDouble();

		s1.setingData(i, n, e, s, m);

		System.out.println("----------------------");

		StudentMethod s2 = new StudentMethod();

		System.out.println("Enter id, Name, email, std,marks in %:");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		s = sc.next();
		m = sc.nextDouble();

		s2.setingData(i, n, e, s, m);

		System.out.println("-----------------------");

		StudentMethod s3 = new StudentMethod();

		System.out.println("Enter id, Name, email, std,marks in %:");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		s = sc.next();
		m = sc.nextDouble();

		s3.setingData(i, n, e, s, m);

		System.out.println("-----------------------");

		s1.display();
		System.out.println();

		s2.display();
		System.out.println();

		s3.display();
		sc.close();
		
	}

}
