package strings;

import java.util.Arrays;

public class StringSplitRemoveSpaceReversePrint {

	void worldLength(String s) {
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " => " + str[i].length());
//			System.out.println(s);
		}
	}

	void reversePrint(String s) {
		String str[] = s.split(" ");
		System.out.println("Orignal string");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}

	public static void main(String[] args) {

		String s = "java is a good programming language";
		StringSplitRemoveSpaceReversePrint obj = new StringSplitRemoveSpaceReversePrint();
		obj.worldLength(s);
		obj.reversePrint(s);
	}
}