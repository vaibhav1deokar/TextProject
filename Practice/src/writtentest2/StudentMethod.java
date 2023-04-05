package writtentest2;

import java.util.Scanner;

public class StudentMethod {

	Scanner sc = new Scanner(System.in);

	float english, math, science, marathi;

	void studentData() {

		english = sc.nextFloat();
		math = sc.nextFloat();
		science = sc.nextFloat();
		marathi = sc.nextFloat();

		float avg = (english + math + science + marathi) / 400;
		float per = avg * 100;

		if (english < 35) {
			System.out.println("Student fail in English");
		} else if (math < 35) {
			System.out.println("Student fail in Math");
		} else if (science < 35) {
			System.out.println("Student fail in Science");
		} else if (marathi < 35) {
			System.out.println("Student fail in Marathi");
		}

		else if (per <= 100.0 && per >= 80) {
			System.out.println("Student pass with 1st class with percentage = " + per + "%");
		} else if (per <= 79.0 && per >= 50) {
			System.out.println("Student pass with 2nd class with percentage = " + per + "%");
		} else if (per <= 49.0 && per >= 35) {
			System.out.println("Student pass with 3rd class with percentage = " + per + "%");
		} else if (per <= 34.0) {
			System.out.println("Student are fail with percentage = " + per);
		} else {
			System.out.println("Invalid input");
		}

	}

	void display() {
		System.out.println("1.English 2.Math 3.Science 4.Marathi");
		System.out.println(english + ", " + math + ", " + science + ", " + marathi);
	}

}
