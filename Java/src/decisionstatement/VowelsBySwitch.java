package decisionstatement;

import java.util.Scanner;

public class VowelsBySwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a charecter");
		char ch;
		ch = sc.next().charAt(0);

		switch (ch) {

		case 'a':
			System.out.println("vowel");
			break;
			
		case 'e':
			System.out.println("vowel");
			break;
			
		case 'i':
			System.out.println("vowel");
			break;
			
		case 'o':
			System.out.println("vowel");
			break;
			
		case 'u':
			System.out.println("vowel");
			break;
			
		default :
			System.out.println("Consonant");

		}
		sc.close();

	}
}
