package AssimentOnSwitch;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");

		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		switch (a) {
		case 1:
			if (a > b)
				System.out.println("Greater = " + a);
		case 2:
			if (b > a)
				System.out.println("Greater = " + b);

		}
		sc.close();

	}
}