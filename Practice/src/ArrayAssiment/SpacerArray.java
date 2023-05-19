package ArrayAssiment;

import java.util.Arrays;
import java.util.Scanner;

public class SpacerArray {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];

		int c = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter row and col");
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 0) {
					c++;
				}
			}
		}
		if (c > 3 * 3 / 2) {
			System.out.println("Matrix is Sparse");
		} else {
			System.out.println("Matrix not Sparese");
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(Arrays.toString(arr[k]));
		}
	}
}