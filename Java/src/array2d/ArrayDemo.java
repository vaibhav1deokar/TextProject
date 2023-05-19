package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[][] = new int[2][3];
		int avg = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			avg = 0;
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the value of row and col");
				arr[i][j] = sc.nextInt();
				sum = sum + arr[i][j];
//				avg = sum/3;
			}
			avg = sum / 3;
			System.out.println("Avarage of row : " + avg);

			for (int k = 0; k < arr.length; k++) {
				System.out.println(Arrays.toString(arr[k]));
			}
		}
	}

}
