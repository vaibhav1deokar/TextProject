package BasicJava;

import java.util.Scanner;

public class pallendrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r, sum = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("palendrome");
		} else {
			System.out.println("not palendrime");
		}
		sc.close();
	}
}
