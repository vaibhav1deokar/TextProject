package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	void arraySort(int a[]) {
		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("sort array is : " + Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter size of array");
		size = sc.nextInt();

		System.out.println("Enter the elements");

		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		SortArray s = new SortArray();
		s.arraySort(a);

		sc.close();
	}

}
