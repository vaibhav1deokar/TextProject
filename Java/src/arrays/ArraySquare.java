package arrays;

import java.util.Scanner;

public class ArraySquare {
	Scanner sc = new Scanner(System.in);

	void arrayElement(int a[]) {

		int sqt = 0;
		for (int i : a) {
			sqt = i * i;
			System.out.println("square root is = " + sqt);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;

		System.out.println("enter size");
		size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("enter array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		ArraySquare obj = new ArraySquare();
		obj.arrayElement(arr);

		sc.close();
	}

}
