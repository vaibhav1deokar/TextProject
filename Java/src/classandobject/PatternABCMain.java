package classandobject;

import java.util.Scanner;

public class PatternABCMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.rightAngleABCPattern");
		System.out.println("2.leftAngleabcPattern");
		System.out.println("3.abcPyramid");
		System.out.println("choose Option");

		PatternABCMethod obj = new PatternABCMethod();

		int a = sc.nextInt();

		switch (a) {
		case 1:
			obj.rightAngleABCPattern('e');
			break;
		case 2:
			obj.leftAngleabcPattern('f');
			break;
		case 3:
			obj.abcPyramid('g');
			break;
		default:
			System.out.println("Invalid Input");
		}

		sc.close();
	}

}
