package arrays;

public class ArrayExample {

	void arrayLength(int arr[]) {
		System.out.print("length of array is = " + arr.length);
	}

	void displayElements(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	void EvenElement(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}
	}

	void EvenElementIndex(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 11, 20, 31, 40, 51, 60, 71, 80, 91, 100 };

		ArrayExample obj = new ArrayExample();
		obj.arrayLength(arr);
		
		System.out.println();
		obj.displayElements(arr);
		
		System.out.println();
		obj.EvenElement(arr);
		
		System.out.println();
		obj.EvenElementIndex(arr);
	}
}
