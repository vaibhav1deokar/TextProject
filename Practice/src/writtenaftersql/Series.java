package writtenaftersql;

import java.util.Scanner;

public class Series {

	void printSeries() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();
		int a = 5;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			a += (i * 8);
		}
//		System.out.println(currentValue);
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the value of n: ");
//		int n = scanner.nextInt();

		Series obj = new Series();
		obj.printSeries();
//		printSeries(n);

//		System.out.println();
	}

//	public static void printSeries(int n) {
//		int currentValue = 5;
//
//		for (int i = 1; i <= n; i++) {
//			System.out.print(currentValue + " ");
//			currentValue += (i * 8);
//		}
//	}

}
