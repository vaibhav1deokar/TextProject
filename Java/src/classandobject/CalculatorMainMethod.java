package classandobject;

import java.util.Scanner;

public class CalculatorMainMethod {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two no.");

		int a = sc.nextInt();

		int b = sc.nextInt();

		CalculatorMethod cal = new CalculatorMethod();

		cal.addition(a, b);

		cal.Subtraction(a, b);

		cal.Multiplication(a, b);

		cal.Division();

		sc.close();
	}

}
