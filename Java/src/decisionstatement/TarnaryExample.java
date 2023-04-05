package decisionstatement;

import java.util.Scanner;

public class TarnaryExample {

	public static void main(String[] args) {

		int a;
		Scanner xy = new Scanner(System.in);

		System.out.println("Enter number = ");

		a = xy.nextInt();

		String z = a % 2 == 0 ? "Even Number" : "Odd Number";
		System.out.println(z);

		String y = a > 0 ? "Positive Number" : "Negative Number";
		System.out.println(y);
		xy.close();
	}

}
