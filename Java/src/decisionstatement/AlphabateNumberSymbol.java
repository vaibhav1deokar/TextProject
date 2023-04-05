package decisionstatement;

import java.util.Scanner;

public class AlphabateNumberSymbol {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any");
		char ch;
		ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z')
			System.out.println("This is small Alphabate");
		
		else if (ch >= 'A' && ch <= 'Z')
			System.out.println("This is capital Alphabate");
		
		else if (ch >= 0)
			System.out.println("This is number");
		
		else
			System.out.println("This is Symbol");

		sc.close();
	}
}
