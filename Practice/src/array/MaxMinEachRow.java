package array;

import java.util.Arrays;

public class MaxMinEachRow {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 5, 4 }, { 5, 6, 2, 1, 4 }, { 6, 5, 4, 8, 2 } };

		int i, j, max = 0;

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(Arrays.toString(arr[k]));
		}
		
		System.out.println("Max element");

		for (i = 0; i < arr.length; i++) {
			max = arr[i][0];
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < max) {
					max = arr[i][j];
				}
			}
			System.out.println(max);
		}
//		for (int k = 0; k < arr.length; k++) {
//			System.out.println(Arrays.toString(arr[k]));
//		}
	}
}
