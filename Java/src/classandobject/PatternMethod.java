package classandobject;

import java.util.Scanner;

public class PatternMethod {

	Scanner in = new Scanner(System.in);

	void rightAnglePattern() {

		System.out.println("Enter the no.");

		int a = in.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

	void reverseAnglrPattern() {

		System.out.println("Enter the no.");

		int a = in.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
//		System.out.println();
	}

	void pyramidPattern() {

		System.out.println("Enter the no.");

		int a = in.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int k = 1; k <= a - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
