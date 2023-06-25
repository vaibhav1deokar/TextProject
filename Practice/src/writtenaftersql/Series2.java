package writtenaftersql;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms to print: ");
		int n = scanner.nextInt();

		int a = 0;
		int b = 1;

//		System.out.print("Series: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a += b;
			b++;
		}

		scanner.close();
	}

}
