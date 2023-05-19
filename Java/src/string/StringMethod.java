package string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

		String s11 = "rakesh";
		s11 = s11.toUpperCase();
		System.out.println(s11);

		String s12 = s11.toLowerCase();
		System.out.println(s12);

		String s13 = "vaibhav";
		String s14 = s13.toLowerCase();
		System.out.println(s14);

		// charAt (index);

		String s10 = "vaibhav";
		System.out.println(s10.charAt(0));
		// find frequency of letter'a';

		int count = 0;
		for (int i = 0; i < s10.length(); i++) {
			if (s10.charAt(i) == 'a')
				;
			count++;
		}
		System.out.println(count);

		System.out.println(s10.indexOf('a'));

		System.out.println("ramesh".indexOf("me"));

		System.out.println("Shubhangi".indexOf('m'));

		System.out.println("no pain no gain".lastIndexOf('n'));

		System.out.println("ramesh".compareTo("sanket"));

		System.out.println("ramesh".compareTo("ramesh"));

		System.out.println("abc".compareTo("ccc"));

		System.out.println("eee".compareTo("abc"));

		s10 = "java";
		char[] chArr = s10.toCharArray();
		System.out.println(Arrays.toString(chArr));

		s10 = "no pain no gain";
		char[] charr = s10.toCharArray();
		System.out.println(Arrays.toString(charr));

		// find frequency of 'n'

		
		
		
		
		count = 0;
		for (char ch : charr) {
			if (ch == 'n') {
				count++;
			}
			// System.out.println(count);
		}
		System.out.println(count);

		char x;
		for (int i = 0; i < s10.length(); i++) {
			count = 0;
			for (int j = 0; j < s10.length(); j++) {

				if (s10.charAt(i) == s10.charAt(j)) {
					count++;
					x = s10.charAt(i);
				}
			}
//			if(x!=null) {
			System.out.println("frequency of " + s10.charAt(i) + " is " + count);
//			}
		}
//		if (x != null) {
//			System.out.println("frequency of " + s10.charAt(i) + " is " + count);
//		}
	}
}