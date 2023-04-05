package encapsulation;

import java.util.Scanner;

public class FacultyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id,Name,Subject,Contact,Salary");

		Faculty f1 = new Faculty();

		f1.setId(sc.nextInt());
		f1.setName(sc.next());
		f1.setSubject(sc.next());
		f1.setContact(sc.next());
		f1.setSalary(sc.nextInt());

		Faculty f2 = new Faculty();

		f2.setId(sc.nextInt());
		f2.setName(sc.next());
		f2.setSubject(sc.next());
		f2.setContact(sc.next());
		f2.setSalary(sc.nextInt());

		System.out.println(
				f1.getId() + " " + f1.getName() + " " + f1.getSubject() + " " + f1.getContact() + " " + f1.getSalary());
		System.out.println(
				f2.getId() + " " + f2.getName() + " " + f2.getSubject() + " " + f2.getContact() + " " + f2.getSalary());

		sc.close();
	}

}
