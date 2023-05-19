package exceptionhandaling;

import java.util.Scanner;

public class Calculate {

	void add(int a, int b) {
		System.out.println("Add is :" + (a + b));
	}

	void division(int a, int b) {
		if(b=='\0') {
			throw new NullPointerException("Num is not zero, Enter valid num......");
		}
		System.out.println("div is : " + (a / b));
	}

	void multi(int a, int b) {
		System.out.println("Multi is :" + (a * b));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two no.");

		int a = sc.nextInt();
		int b = sc.nextInt();

		Calculate obj = new Calculate();
		obj.add(a, b);
		try {
		obj.division(a, b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		obj.multi(a, b);

	}
}