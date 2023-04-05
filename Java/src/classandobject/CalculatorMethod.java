package classandobject;

import java.util.Scanner;

public class CalculatorMethod {

	void addition(int a, int b) {
		System.out.println("Sum of two no. is = " + (a + b));
	}

	void Subtraction(int a, int b) {
		System.out.println("Sub of two no. is = " + (a - b));
	}

	void Multiplication(int a, int b) {
		System.out.println("Mul. of two no. is = " + (a * b));
	}

	void Division() {
		Scanner div = new Scanner(System.in);
		System.out.println("Enter two no.");
		int a = div.nextInt();
		int b = div.nextInt();
		while (b == 0 || b < 0) {
			System.out.println("please enter non zero positive no.");
			b = div.nextInt();
		}
		System.out.println("Div. of two no. is = " + (a / b));
		div.close();
	}

}
