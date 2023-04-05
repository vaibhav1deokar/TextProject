package whilelooping;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int num, power, ans;
		num = sc.nextInt();
		ans = 1;

		System.out.println("Enter power");
		power = sc.nextInt();

		int c = 1;
		while (c <= power) {
			ans = ans * num;
			c++;
		}
		System.out.println("ans is " + ans);
		sc.close();
	}

}
