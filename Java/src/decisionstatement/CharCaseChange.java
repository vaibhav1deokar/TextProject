package decisionstatement;

import java.util.Scanner;

public class CharCaseChange {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char ch;
		System.out.println("enter a charecter");

		ch = input.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			int i = ch - 32;
			System.out.println((char) i);
		} else if (ch >= 'A' && ch <= 'Z') {
			int j = ch + 32;
			System.out.println((char) j);
		} else {
			System.out.println("invalid");
		}

		input.close();

	}

}
