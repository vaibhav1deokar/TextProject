package ArrayAssiment;

import java.util.Arrays;
import java.util.Scanner;

public class SymetricMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];
		int i, j, f = 0;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter element in [" + i + "][" + j + "]");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix ....");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (arr[i][j] != arr[j][i]) {
					f = 1;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		if (f == 0) {
			System.out.println("Matrix is symmetrical");
		} else {
			System.out.println("Matrix not symmetrical");
		}
	}

}
