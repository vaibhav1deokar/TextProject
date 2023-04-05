package assimentonwhile;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two no.");

		int n = sc.nextInt();
		int m = sc.nextInt();
		int i, j;
		for (i = n; i <= m; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0)
					break;
			}
			if (i == j) {
				System.out.println(j);
			}
		}

	}

}
