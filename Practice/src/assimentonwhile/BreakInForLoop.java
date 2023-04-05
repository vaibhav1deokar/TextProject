package assimentonwhile;

import java.util.Scanner;

public class BreakInForLoop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a, n;
		a = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			n = i * a;
			if (i == 5)
				break;
			System.out.println(+n);
		}
		sc.close();
	}

}
