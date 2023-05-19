package arrays;

import java.util.Arrays;

public class SmallChar {
	char min;

	void charSmall(char[] a) {

//		Arrays.sort(a);
		char temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("min char. : " + a[0]);

//		for (char r : a) {
//			if (r < min) {
//				min = r;
//			}
//			System.out.println(min);
//		}
//		System.out.println(min);
	}

	public static void main(String[] args) {

		char[] a = { 'D', 'E', 'x', 'z', 'R', 'A' };

		SmallChar c = new SmallChar();
		c.charSmall(a);

	}

}
