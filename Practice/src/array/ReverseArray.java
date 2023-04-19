package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	void arrayrev(int arr[]) {
		int l = arr.length;
		int mid = l / 2;

		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[l - i - 1];
			arr[l - i - 1] = temp;
		}
		System.out.println("Reverse Array = " + Arrays.toString(arr));
	}

	public static void main(String[] args) {

//		int arr[] = { 2, 8, 8, 3, 4, 9, 2, 1, 5, 6, 4, 6, 5, 0, 8 };

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter the size of array");
		size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
//			System.out.println("Enter element");
		}

		ReverseArray r = new ReverseArray();
		r.arrayrev(arr);

		sc.close();

	}

}
