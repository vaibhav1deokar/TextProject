package decisionstatement;

import java.util.Scanner;

public class VowelUsingSwitch1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch;
		ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("This is Vowel");
			break;
		default:
			System.out.println("This is consonant");
		}
		sc.close();

	}

}
