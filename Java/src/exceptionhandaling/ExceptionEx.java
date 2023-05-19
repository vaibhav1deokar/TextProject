package exceptionhandaling;

import java.util.Scanner;

public class ExceptionEx {

	void add(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}

	void division(int a, int b) {
		System.out.println("div is : " + (a / b));
	}

	void mult(int a, int b) {
		System.out.println("mult is :" + (a * b));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter two no.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		ExceptionEx obj = new ExceptionEx();
		obj.add(a, b);

		try {
			obj.division(a, b);
		} catch (ArithmeticException e) {
			System.out.println(a);
		}
//		obj.division(a, b);
		obj.mult(a, b);

		System.out.println("done");
	}

}
