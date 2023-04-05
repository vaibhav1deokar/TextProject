package decisionstatement;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float area, Radius;
		System.out.println("Enter the no. = ");

		Radius = sc.nextFloat();

		area = 3.14f * Radius * Radius;
		System.out.println("Area of Circle is = " + area);
		sc.close();
	}

}
