package assimentonwhile;

import java.util.Scanner;

public class SumOfEvenNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the no.");
		int a = 1; // sc.nextInt();
		int sum = 0;
		System.out.println("Enter no.");
		int b = sc.nextInt();

		while (a <= b) {
			if (a % 2 == 0) {
				sum = sum + a;
				System.out.println(a);
			}
			a++;
		}
		System.out.println("Even no sum is = " + sum);
		sc.close();
	}

}
