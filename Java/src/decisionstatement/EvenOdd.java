package decisionstatement;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Even no.");
		
		}else {
			System.out.println("Odd no.");
		}
		sc.close();
	}

}
