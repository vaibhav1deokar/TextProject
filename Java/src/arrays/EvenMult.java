package arrays;

import java.util.Scanner;

public class EvenMult {

	void multiplyEven(int arr[]) {
		int p = 1;
		for (int i : arr) {
			if (i % 2 == 0) {
				p = p * i;
			}
		}
		System.out.println("Product of even elements :" + p);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");

		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array of elements");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		EvenMult obj = new EvenMult();
		obj.multiplyEven(arr);
		
		ReverseArray r  = new ReverseArray();
		r.reverseArray(arr);
		
		sc.close();
	}

}
