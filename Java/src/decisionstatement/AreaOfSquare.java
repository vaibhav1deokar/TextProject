package decisionstatement;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, Area;

		System.out.println("Enter the length = ");

		a = sc.nextInt();

		Area = a * a;

		System.out.println("Area of square is" + Area);
		sc.close();
	}

}
