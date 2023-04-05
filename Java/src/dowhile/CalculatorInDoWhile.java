package dowhile;

import java.util.Scanner;

public class CalculatorInDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ch = 'y';
		do {
//		Scanner sc = new Scanner(System.in);

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
		System.out.println("do you want to continue y/n");
		ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
		sc.close();
	}

}
