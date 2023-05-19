package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDiag {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];
		int sum = 0;
		int sum1 = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println("Enter the row and col");
				arr[i][j] = sc.nextInt();
				if (arr[i]==(arr[j])) {
					sum = sum + arr[i][j];
				}
				if (i+j == arr.length-1) {
					sum1 = sum1 + arr[i][j];
				}
			}
//			for (int k = 0; k < arr.length; k++) {
//				System.out.println(Arrays.toString(arr[k]));
//			}
//			System.out.println("Sum of digonal is : " + sum);
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(Arrays.toString(arr[k]));
		}
		System.out.println("Sum of 1st digonal is : " + sum);
		System.out.println("Sum of 2nd dia. is :" + sum1);

	}

}
