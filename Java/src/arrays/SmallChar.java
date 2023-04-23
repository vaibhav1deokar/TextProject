package arrays;

import java.util.Arrays;

public class SmallChar {
	char min;

	void charSmall(char[] a) {

		Arrays.sort(a);
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
