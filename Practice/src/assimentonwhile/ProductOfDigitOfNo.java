package assimentonwhile;

import java.util.Scanner;

public class ProductOfDigitOfNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a = sc.nextInt();
		int rem;
		int pro = 1;
		while (a != 0) {
			rem = a % 10;
			pro = pro * rem;
			a = a / 10;
//			System.out.println(+pro);
		}
		System.out.println("Product is " + pro);
		sc.close();
	}

}
