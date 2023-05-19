package ArrayAssiment;

import java.util.Arrays;
import java.util.Scanner;

public class LowerMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter m. Element [" + i + "][" + j + "]");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix");

		for (i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println();

		System.out.println("Lower Matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i > j) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

}
