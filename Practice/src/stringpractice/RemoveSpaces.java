package stringpractice;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "";
		System.out.println("Enter String");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' ')) {
				continue;
			} else {
				s = s + str.charAt(i);

			}
		}
		System.out.println(s);
	}
}