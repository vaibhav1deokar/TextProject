package decisionstatement;

import java.util.Scanner;

public class CharInput {
	public static void main(String[] args) {

		char v;
		System.out.println("Enter a char. ");

		Scanner z = new Scanner(System.in);

		v = z.next().charAt(0);

		int ascii = v;

		System.out.println("ascii value is " + ascii);

		z.close();
	}

}
