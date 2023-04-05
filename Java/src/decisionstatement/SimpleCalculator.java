package decisionstatement;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter the option");
		int opt;
		opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Addition of two no. is " + (a + b));
			break;
		case 2:
			System.out.println("Subtraction of two no. is " + (a - b));
			break;
		case 3:
			System.out.println("Multiplication of two no. is " + (a * b));
			break;
		case 4:
			if (b == 0) {
				System.out.println("number should not be zero");
				b = sc.nextInt();
				System.out.println("Division of two number is" + (a / b));
			} else
				System.out.println("Division of two number is" + (a / b));
			break;
		default:
			System.out.println("done with calculator");
		}
		sc.close();
	}

}
