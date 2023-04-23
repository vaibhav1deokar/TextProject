package array;

public class MaxMin {

	void max(int a[]) {
		int min = a[0];
		int max = a[0];
		for (int i : a) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = 1;
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

	void max1(int a[]) {
		int max = a[0];
		int min = a[0];

		for (int i : a) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {

		int a[] = { 2, 8, 6, 7, 1, 4, 5, 6, 8, 3, 0 };

		MaxMin m = new MaxMin();
		m.max(a);
		m.max1(a);
	}

}
