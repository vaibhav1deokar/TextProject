package forlooping;

import java.util.Scanner;

public class SquareOfTenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int j;
		int c = 1;
		j = sc.nextInt();

		for (int i = 1; i <= j; i++) {

			c = i * i;
			System.out.println("Square of " + i + " is = " + c);
		}
//		System.out.println("square is"+c);
		sc.close();
	}

}
