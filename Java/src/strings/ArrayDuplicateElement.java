package strings;

import java.util.Arrays;

public class ArrayDuplicateElement {

	void displayUniqueElement() {
		int arr[] = { 10, 50, 10, 60, 20, 20, 50, 40, 60, 20, 10, 30, 80, 90, 100 };

		boolean br[] = new boolean[arr.length];
		int count = 1;
		Arrays.fill(br, true);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					br[j] = false;
				}
			}
			if (count == 1 && br[i] != false) {
				System.out.println(arr[i]);
			}
//			System.out.println(Arrays.toString(br));
		}
		System.out.println(Arrays.toString(br));

	}

	void removeDuplicateElement() {
		int arr[] = { 10, 50, 10, 60, 20, 20, 50, 40, 60, 20, 10, 30, 80, 90, 100 };

		int d[] = new int[arr.length / 2];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				d[x] = arr[i];
				x++;
			}
		}
		for (int i : d) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}

	void removeDuplicateWithSorting() {
		int arr[] = { 10, 50, 10, 60, 20, 20, 50, 40, 60, 20, 10, 30};

		int d[] = new int[arr.length / 2];
		int x = 0;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				d[x] = arr[i];
				x++;
			}
		}
		d[x] = arr[arr.length - 1];
		for (int i : d) {
			if (i != 0)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		ArrayDuplicateElement obj = new ArrayDuplicateElement();
		obj.displayUniqueElement();
		obj.removeDuplicateElement();
		obj.removeDuplicateWithSorting();

	}

}
