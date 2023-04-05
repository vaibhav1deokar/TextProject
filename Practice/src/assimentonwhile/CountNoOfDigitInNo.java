package assimentonwhile;

import java.util.Scanner;

public class CountNoOfDigitInNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a, count = 0;
		a = sc.nextInt();

		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println("no. of digit is = " + count);
		sc.close();
	}

}
