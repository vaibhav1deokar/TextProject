package AssimentOnSwitch;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.Addition\n2.Subtraction\n3.Multiplation\n4.Division");
		System.out.println("Enter the operation no.");

		int a, b, op;
		op = sc.nextInt();
		// System.out.println("Enter the operation no.");
		// a = sc.nextInt();
		System.out.println("Enter First no.");
		a = sc.nextInt();
		// b = sc.nextInt();
		System.out.println("Enter Second no.");
		b = sc.nextInt();

		switch (op) {

		case 1:
			op = a + b;
			System.out.println("Result is " + op);
			break;
		case 2:
			op = a - b;
			System.out.println("Result is " + op);
			break;
		case 3:
			op = a * b;
			System.out.println("Result is " + op);
			break;
		case 4:
			if (b == 0) {
				System.out.println("number not equal to zero");
			} else {
				op = a / b;
				System.out.println("result is " + op);
			}
			break;
		default:
			System.out.println("enter valid no.");

		}
		sc.close();
	}

}
