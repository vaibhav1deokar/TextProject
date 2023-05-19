package string;

import java.util.Arrays;

public class SplitString {
	public static void main(String[] args) {

		String s = "Hallo@Word";

		String token[] = s.split("@");

		for (String str : token) {
			System.out.println(str);
		}
//		System.out.println(Arrays.toString(token));
	}
}