package Exception;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no.");
		String a = sc.nextLine();

		try {
			int num = Integer.parseInt(a);
			System.out.println("the no. is : " + num);
		} catch (NumberFormatException e) {
			System.out.println("invalid no. : " + a);
		}

	}

}
