package whilelooping;

import java.util.Scanner;

public class MinAndMaxFromDigit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =1, max = num % 10, min = num % 10;
		num = sc.nextInt();

		while (num != 0) {
			int r = num % 10;
			if (r > max) {
				max = r;
			}
			else if (r < min) {
				min = r;
			}
			num = num / 10;
		}
		System.out.println("Greater Number " + max);
		System.out.println("Smaller Number" + min);
		sc.close();
	}

}
