package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s = "keep";
		String b = "peek";

		char[] arr1 = s.toCharArray();
		char[] arr2 = b.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		String c = new String(arr1);
		String d = new String(arr2);

		if (c.equals(d)) {
			System.out.println("String are Anagram");
		} else {
			System.out.println("String not Anagram");
		}
	}
}