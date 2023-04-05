package classandobject;

import java.util.Scanner;

public class PatternMainMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.rightAnglePattern");
		System.out.println("2.leftAnglrPattern");
		System.out.println("3.pyramidPattern");
		System.out.println("Chose one");
		int b = sc.nextInt();
		PatternMethod pt = new PatternMethod();
		switch (b) {
		case 1:
			pt.rightAnglePattern();
			break;
		case 2:
			pt.reverseAnglrPattern();
			break;
		case 3:
			pt.pyramidPattern();
			break;
		default:
			System.out.println("invalid");

		}
		sc.close();
	}

}
