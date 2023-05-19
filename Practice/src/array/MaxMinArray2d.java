package array;

public class MaxMinArray2d {
	public static void main(String[] args) {

		int arr[][] = { { 22, 31, 9 }, { 12, 25, 6 } };

		int max = arr[0][0];
		int min = arr[0][0];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
//			System.out.println("Max element : " + max);
//			System.out.println("Min element : " + min);
		}
		System.out.println("Max element : " + max);
		System.out.println("Min element : " + min);
	}
}