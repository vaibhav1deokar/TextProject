package decisionstatement;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char ch;

		System.out.println("Enter the charter");

		ch = input.next().charAt(0);

		if (ch == 'a' || ch == 'A')
			System.out.println(" it's vowel");

		else if (ch == 'e' || ch == 'E')
			System.out.println(" it's vowel");

		else if (ch == 'i' || ch == 'I')
			System.out.println(" it's vowel");

		else if (ch == 'o' || ch == 'O')
			System.out.println(" it's vowel");

		else if (ch == 'u' || ch == 'U')
			System.out.println(" it's vowel");

		else
			System.out.println(" it's consonant");
		input.close();
	}

}
