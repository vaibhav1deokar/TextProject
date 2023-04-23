package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDes {

	void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	void sort1(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int a[] = { 5, 8, 7, 1, 9, 4, 6, 2, 1, 8, 7, 3, 5, 9 };
		int size;
		System.out.println("Enter array size");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		SortArrayDes d = new SortArrayDes();
		d.sort(a);
		d.sort1(a);

		sc.close();

	}

}
