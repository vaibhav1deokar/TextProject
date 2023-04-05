package forlooping;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n, num = 1;
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			num = num * i;
		}
		
		System.out.println("Factorial " + num);
		sc.close();
	}

}
