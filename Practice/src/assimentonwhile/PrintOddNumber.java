package assimentonwhile;

import java.util.Scanner;

public class PrintOddNumber {

	public static void main(String[] args) {

//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter 1st no.");
//		int a,b;
//		a = sc.nextInt();
//		System.out.println("Enter 2nd no.");
//		b = sc.nextInt();

		int a = 521;
		int b= 229;
		
		while (a >= b) {
			if (a % 2 != 0) {
				System.out.println("Odd no." + a);
			}
			a--;
		}
//		sc.close();
	}

}
