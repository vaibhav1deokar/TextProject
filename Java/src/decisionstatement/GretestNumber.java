package decisionstatement;

import java.util.Scanner;

public class GretestNumber {
	public static void main(String[] args) {

		int a, b, c, d;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter four digit");

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();

		if (a > b && a > c && a > d)
			System.out.println(+a + " is greatest");

		else if (b > a && b > c && b > d)
			System.out.println(+b + " is greatest");

		else if (c > a && c > b && c > d)
			System.out.println(+c + " is greatest");

		else
			System.out.println(+d + " is greatest");
		input.close();
	}

}
