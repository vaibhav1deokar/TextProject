package Another;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. : ");

		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		if (temp % sum == 0) {
			System.out.println("The no. is Haeshad");
		} else {
			System.out.println("Not Harshad");
		}

		sc.close();
	}

}
