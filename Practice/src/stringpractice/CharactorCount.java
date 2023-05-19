package stringpractice;

import java.util.Scanner;

public class CharactorCount {

	Scanner sc = new Scanner(System.in);

	void CharCount(String s) {
		System.out.println("Enter char count :");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch + " => " + count);
	}

	void CharCountWithoutMethod(String s) {
		System.out.println("Enter char :");
		char ch = sc.next().charAt(0);
		int count = 0;
		char c[] = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if(ch == c[i]) {
				count++;
			}
		}
		System.out.println(ch+" => "+count);
	}

	public static void main(String[] args) {
		String s = " java is good programming language";
		CharactorCount obj = new CharactorCount();
		obj.CharCount(s);
		obj.CharCountWithoutMethod(s);
	}

}
