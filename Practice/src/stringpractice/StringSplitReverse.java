package stringpractice;

import java.util.Arrays;

public class StringSplitReverse {

	void splitByLength(String s) {
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " => " + str[i].length());
		}
	}

	void reversePrint(String s) {
		String str[] = s.split(" ");
		System.out.println("Orignal string");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}

	void upperCase(String s) {
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i].toUpperCase() + " ");
		}
		System.out.println();
	}

	void upperOdd(String s) {
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (i % 2 != 0) {
				System.out.print(str[i].toUpperCase() + " ");
			} else {
				System.out.print(str[i] + " ");
			}
		}
		System.out.println();
	}

	void changeCase(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);

			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		String s = "JAVA is a GOOD programming language";
		StringSplitReverse obj = new StringSplitReverse();
		obj.splitByLength(s);
//		obj.reversePrint(s);
//		obj.upperCase(s);
		obj.upperOdd(s);
		obj.changeCase(s);
	}
}