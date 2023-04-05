package AssimentOnSwitch;

import java.util.Scanner;

public class EvenOddBySwitch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the no. ");
		a = sc.nextInt();
		b = a % 2;

		switch (b) {
		case 1: {
			//b = a % 2;
			System.out.println("It is odd no. ");
			break;
		}
		default: {
			System.out.println("It is Even no. ");
		}

		}
		sc.close();

	}

}
