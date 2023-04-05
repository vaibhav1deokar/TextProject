package whilelooping;

import java.util.Scanner;

public class AdditionNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int a, b, sum;
		a = sc.nextInt();

		sum = 0;
		System.out.println("Enter end");
		b = sc.nextInt();

		while (a <= b) {
			sum = sum + a;
			a++;
		}
		System.out.println("Ans is " + sum);
		sc.close();
	}

}
