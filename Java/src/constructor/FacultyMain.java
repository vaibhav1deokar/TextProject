package constructor;

import java.util.Scanner;

public class FacultyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FacultyMethod f1 = new FacultyMethod();

		System.out.println("Enter id, name,subject,collage,salary");

		int id = sc.nextInt();
		String name = sc.next();
		String subject = sc.next();
		String collage = sc.next();
		int salary = sc.nextInt();

		FacultyMethod f2 = new FacultyMethod(id, name, subject, collage, salary);

//	FacultyMethod f3 = new FacultyMethod(id,name,subject,collage,salary);

		id = sc.nextInt();
		name = sc.next();
		subject = sc.next();
		collage = sc.next();
		salary = sc.nextInt();

		FacultyMethod f3 = new FacultyMethod(id, name, subject, collage, salary);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

		sc.close();

	}
}