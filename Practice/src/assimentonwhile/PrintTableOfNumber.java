package assimentonwhile;

import java.util.Scanner;

public class PrintTableOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no.");
		int a = sc.nextInt();
		int n = 1;
		for (int i = 1; i <= 10; i++) {
			n = a * i;
			System.out.println(n);
		}
		sc.close();
	}

}
