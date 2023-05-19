package Another;

public class AscDsc {

	public static void main(String[] args) {

		int a[] = { 4, 6, 7, 3, 1, 8 };

		int i, j, temp;

		System.out.println("Input");

		for (i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println("\nOutput");
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (i = 0; i < a.length / 2; i++) {
			System.out.print(" " + a[i]);
		}

//		for (i = 0; i < a.length; i++) {
//			System.out.print(" " + a[i]);
//		}

		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (i = 0; i < a.length / 2; i++) {
			System.out.print(" " + a[i]);
		}

	}

}
