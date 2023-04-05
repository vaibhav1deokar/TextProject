package assimentonwhile;

import java.util.Scanner;

public class PrintEvenNo {
	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter 1st no.");
//		int a, b;
//		a = sc.nextInt();
//		System.out.println("Enter 2nd no. ");
//		b  = sc.nextInt();

		int a = 121;
		int b = 229;

		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
//				System.out.println("Even no. Between"+a+" and "+b+"\n"+i);
				System.out.println(i);
			}
//			sc.close();
		}
	}

}
