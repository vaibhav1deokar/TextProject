package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		int arr[][] = new int[2][3];

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter row and col");
				arr[i][j] = sc.nextInt();
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of rows are : " + sum);

			for (int k = 0; k < arr.length; k++) {
				System.out.println(Arrays.toString(arr[k]));
			}
		}
	}
}