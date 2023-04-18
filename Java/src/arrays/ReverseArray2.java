package arrays;

import java.util.Arrays;

public class ReverseArray2 {

	void reverseArray(int arr[]) {
		int l = arr.length;
		int mid = arr.length / 2;
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[l - i - 1];
			arr[l - i - 1] = temp;
		}
		System.out.println("Reverse Array :" + Arrays.toString(arr));
	}

	void reverse1(int arr1[]) {
		int l = arr1.length; // {5,6,7,8,1,2,3,4}
		int mid = l / 2;
		for (int i = 0; i < mid; i++) {
			int temp = arr1[i];
			arr1[i] = arr1[(i + 4)];
			arr1[(i + 4)] = temp;
		}

		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(arr.length);
		System.out.println("Original array :" + Arrays.toString(arr));
		ReverseArray2 r = new ReverseArray2();
		r.reverseArray(arr);
		r.reverse1(arr1);
	}

}
