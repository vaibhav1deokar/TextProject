package arrays;

public class BeforeSquare {

	void squareBefore(int[] a) {
		int j;
		for (int i = 0; i < a.length; i++) {
			for (j = i; j < a.length; j++) {
				if (a[i] < 0) {
					a[j - 1] = a[j] * a[j];
				}
			}
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] a = { 2, 5, -8, 4, 6, -9, 5, -2, 9, -6, 5 };

		BeforeSquare b = new BeforeSquare();
		b.squareBefore(a);
	}
}