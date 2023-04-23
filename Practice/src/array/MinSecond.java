package array;

import java.util.Arrays;

public class MinSecond {

	void secondMin(int[] a) {
		int min = a[0];
		int min2 = a[1];
		for (int i = 2; i < a.length; i++) {
			if (a[i] < min) {
				min2 = min;
				min = a[i];
			} else if (a[i] < min2) {
				min2 = a[i];
			}
		}
		System.out.println("second min : " + min);
	}

	void duplicate(int[] a) {
		int j = 0;
		Arrays.sort(a);

		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;
			}
		}
		System.out.println(a[1]);

	}
//	void secondMin2(int [] a) {
//		Arrays.sort(a);
//		System.out.println(a[2]);
//	}

	public static void main(String[] args) {

		int[] a = { 5, 7, 1, 9, 4, 3, 6, 8, 5, 2, 4, 8, 7, 4, 6, 1, 4, 5 };

		MinSecond n = new MinSecond();
		n.secondMin(a);
		n.duplicate(a);
//		n.secondMin2(a);
	}

}
