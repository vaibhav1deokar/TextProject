package array;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr1[] = { 2, 5, 8, 7, 3 };
		int arr2[] = { 2, 4, 6, 3, 2 };

		int i, j;
		for (i = 0; i < arr1.length; i++) {

			for (j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.print(arr1[i] + " ");
				}
			}
		}
	}
}
