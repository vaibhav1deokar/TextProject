package AssimentOnSwitch;

import java.util.Scanner;

public class NumberPrintInWorld {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a;
		a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid Credentials");
		}
		sc.close();

	}

}
