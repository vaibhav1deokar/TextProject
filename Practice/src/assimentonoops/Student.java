package assimentonoops;

import java.util.Scanner;

public class Student {

	int id;
	String name, std;
	double percentage;

	void studentData(int id, String name, String std, double percentage) {

		this.id = id;
		this.name = name;
		this.std = std;
		this.percentage = percentage;

	}

	void display() {
		System.out.println(id + " " + name + " " + std + " " + percentage);
	}
	
//	public String to String() {
//		return id+" "+name+" "+std+" "+percentage;
//	}

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

		sc.close();

	}
}
