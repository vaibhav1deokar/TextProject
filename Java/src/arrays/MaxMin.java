package arrays;

public class MaxMin {

	void arrayMinMax(int arr[]) {
		
		int min = arr[0], max = arr[0];
		
		for (int i : arr) {
			if (i > max) {
				max = i;

			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println("maximun = " + max);
		System.out.println("minumum = " + min);
	}

	public static void main(String[] args) {

		int arr[] = { 25, 56, 78, 45, 12, 65, 98, 52 };

		MaxMin m = new MaxMin();
		m.arrayMinMax(arr);
	}

}
