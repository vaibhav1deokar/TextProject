package strings;

import java.util.Arrays;

public class ArrayDuplicate {

	void displayUniqueElements() {
		int arr[] = { 10, 20, 30, 10, 20, 40, 20, 30, 50, 60, 30, 20, 10 };
		// i
		boolean br[] = new boolean[arr.length];
		Arrays.fill(br, true);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(br));

		for (int i = 0; i < arr.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
					br[j] = false;
				}
			}
			if (cnt == 1 && br[i] != false) {
				System.out.println(arr[i]);
			}

		}

		// System.out.println(Arrays.toString(br));
	}

	void removeDuplicateElements() {
		// 1
		int arr[] = { 10, 20, 30, 10, 20, 40, 20, 30, 50, 60, 30, 20, 10, 20 };
		// i j
		int d[] = new int[arr.length / 2];

		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				d[x] = arr[i];
				x++;
			}
		}
		for (int i : d) {
			if (i != 0)
				System.out.println(i);
		}

	}

	void removeDuplicateWithSorting() {
		int arr[] = { 10, 20, 30, 10, 20, 70, 20, 30, 50, 60, 30, 20, 10, 20 };
		int d[] = new int[arr.length / 2];
		int x = 0;

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// [10, 10, 10, 20, 20, 20, 20, 20, 30, 30, 30, 40, 50, 60]
		// i

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				d[x] = arr[i];
				x++;
			}
		}

		d[x] = arr[arr.length - 1];

		// System.out.println(Arrays.toString(d));
		for (int i : d) {
			if (i != 0)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		ArrayDuplicate obj = new ArrayDuplicate();

		obj.displayUniqueElements();

		obj.removeDuplicateElements();

		obj.removeDuplicateWithSorting();
	}
}