package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {

	void array(int ar[]) {
		int l = ar.length;
		int mid = l / 2;
		for (int i = 0; i < mid; i++) {
			int temp = ar[i];
			ar[i] = ar[l - i - 1];
			ar[l - i - 1] = temp;
		}
		System.out.println("Reverse array : " + Arrays.toString(ar));
	}

	void square(int ar[]) {
		int sqrt;
		for (int i : ar) {
			sqrt = i * i;
			System.out.println("sqrt : " + sqrt);
		}

	}

	public static void main(String[] args) {

//		int ar[]= {2,8,6,4,2,1,9,7,8,2,3,5,1,5,6,4,9};
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size = sc.nextInt();

		int ar[] = new int[size];
		System.out.println("Enter the elements");

		for (int i = 0; i < ar.length; i++) {
//			System.out.println("Enter elements");
			ar[i] = sc.nextInt();
		}

		ReverseArray2 a = new ReverseArray2();
		a.array(ar);
		a.square(ar);

		sc.close();

	}

}
