package ArrayAssiment;

import java.util.Arrays;
import java.util.Scanner;

public class ScalarMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];
		int i, j, f = 0, dia = 0;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter element [" + i + "][" + j + "]");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix ....");

		dia = arr[0][0];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j && arr[i][j] != dia) {
					f = 1;
				} else if (i != j && arr[i][j] != 0) {
					f = 1;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		if (f == 0) {
			System.out.println("Metrix is Scalar");
		} else {
			System.out.println("Metrix is NOT Scalar");
		}
	}

}
