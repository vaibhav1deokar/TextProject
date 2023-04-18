package arrays;

import java.util.Scanner;

public class ReverseArray {

	Scanner sc = new Scanner(System.in);

	void reverseArray(int arr[]) {

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");
		}
	}

}
