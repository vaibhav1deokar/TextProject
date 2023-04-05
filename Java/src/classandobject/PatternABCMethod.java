package classandobject;

//import java.util.Scanner;

public class PatternABCMethod {
//	Scanner sc = new Scanner(System.in);
//	char ch ='e';

	void rightAngleABCPattern(char ch) {
//		System.out.println("Enter the Character");
//		char ch = sc.next().charAt(0);

		for (char i = 'a'; i <= ch; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void leftAngleabcPattern(char ch) {

//		System.out.println("Enter the Character");
//		char ch = sc.next().charAt(0);
		for (char i = 'a'; i <= ch; i++) {
			for (int k = 1; k <= ch - i; k++) {
				System.out.print(" ");
			}
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void abcPyramid(char ch) {
//		System.out.println("Enter the Character");
//		char ch = sc.next().charAt(0);
		for (char i = 'a'; i <= ch; i++) {
			for (int k = 1; k <= ch - i; k++) {
				System.out.print(" ");
			}
			for (char j = 'a'; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

}
