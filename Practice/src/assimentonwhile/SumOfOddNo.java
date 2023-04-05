package assimentonwhile;

import java.util.Scanner;

public class SumOfOddNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the no.");
		int a = 1; // sc.nextInt();
		System.out.println("Enter the no.");
		int b = sc.nextInt();

		int sum = 0;

		while (a <= b) {
			if (a % 2 != 0) {
				sum = sum + a;
				System.out.println(a);
			}
			a++;
		}
		System.out.println("Odd number sum is = " + sum);
		sc.close();
	}

}
