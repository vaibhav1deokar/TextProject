package array;

import java.util.Scanner;

public class Simple {

	int i = 0;

	void array(int a[]) {
		System.out.println("Length : " + a.length);
	}

	void array2(int a[]) {
		System.out.println("Display of array");
		for (i = 0; i < a.length; i++) {
//			System.out.println("Length of array");
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

	void array3(int a[]) {
		System.out.println("Elements of array");
		for (int j = a.length - 1; j >= 0; j--) {
//			System.out.println("Elements of array");
			System.out.print(" " + a[j]);
		}
		System.out.println();
	}

	void array4(int a[]) {
		System.out.println("reverse index");
		for (int k = 0; k < a.length; k++) {
			if (k % 2 != 0) {
//				System.out.println("reverse index");
				System.out.print(" " + a[k]);
			}
		}
		System.out.println();
	}

	void array5(int a[]) {
		System.out.println("Odd by Index");
		for (int l = 0; l < a.length; l++) {
			if (l % 2 == 0) {
//				System.out.println("Odd by Index");
				System.out.print(" " + a[l]);
			}
		}
		System.out.println();
	}

	void array6(int a[]) {
		System.out.println("Even by Element");
		for (int m = 0; m < a.length; m++) {
			if (a[m] % 2 == 0) {
//				System.out.println("Even by Element");
				System.out.print(" " + a[m]);
			}
		}
		System.out.println();
	}

	void array7(int a[]) {

	}

	public static void main(String[] args) {

//		int a[] = { 25, 36, 7, 54, 26, 9, 5, 1, 62, 31, 84 };

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Emter elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Simple obj = new Simple();
		obj.array(a);
		obj.array2(a);
		obj.array3(a);
		obj.array4(a);
		obj.array5(a);
		obj.array6(a);

		sc.close();

	}

}
