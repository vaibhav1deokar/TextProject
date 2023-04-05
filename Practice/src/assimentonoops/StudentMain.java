package assimentonoops;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student obj1 = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");

		int id = sc.nextInt();
		String name = sc.next();
		String std = sc.next();
		double percentage = sc.nextDouble();

		obj1.studentData(id, name, std, percentage);
		obj1.display();

		Student obj2 = new Student();
		System.out.println("Enter the details");

		id = sc.nextInt();
		name = sc.next();
		std = sc.next();
		percentage = sc.nextDouble();

		obj2.studentData(id, name, std, percentage);
		obj2.display();

		sc.close();
		
//		Student obj3 = obj1;
		
//		System.out.println(obj3);
		
		Student obj3 = new Student();
		
		System.out.println(obj3);

	}
}
