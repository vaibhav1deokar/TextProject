package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingShortArray {
	
	void descendingSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sort Array : " + Arrays.toString(arr));
		System.out.println();
		System.out.println("Second highst Array : "+arr[1]);
		System.out.println();
		System.out.println("Minimum : "+arr[arr.length-1]);
		System.out.println();
		System.out.println("Second minimum : "+arr[arr.length-2]);
	}
	
	public static void main(String[] args) {
		
//		int arr[] = {20,34,5,56,13,2};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");

		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array of elements");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
//		System.out.println("Orignal array"+Arrays.toString(arr));
		
		DescendingShortArray obj = new DescendingShortArray();
		obj.descendingSort(arr);

}

}
