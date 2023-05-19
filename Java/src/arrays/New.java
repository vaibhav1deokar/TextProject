package arrays;

public class New {

	void squareBefore(int[] a) {
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = i; j < a.length; j++) {
				if (a[i] < 0) {
					a[j] = a[j-1] * a[j-1];
				}
			}
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] a = { 2, 5, -8, 4, 6, -9, 5, -2, 9, -6, 5 };

		New b = new New();
		b.squareBefore(a);
	}
}