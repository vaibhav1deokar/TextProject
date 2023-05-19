package ArrayAssiment;

import java.util.Arrays;
import java.util.Scanner;

public class SubstractionMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		int sub[][] = new int[3][3];

		int i, j;

		System.out.println("Element of 1st Matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				arr1[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (i = 0; i < sub.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}

		System.out.println("Element of Second Matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				arr2[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (i = 0; i < sub.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}

		System.out.println("Substraction of two matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sub[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		for (i = 0; i < sub.length; i++) {
			System.out.println(Arrays.toString(sub[i]));
		}

	}
}