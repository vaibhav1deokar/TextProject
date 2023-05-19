package stringpractice;

public class CompareString {

	public static void main(String[] args) {

		String s = "java";

		String s2 = "java";

		int count = 0, i, j;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 0) {
				count++;
			}
		}
		for (j = 0; j < s2.length(); j++) {
			if (s2.charAt(j) != 0) {
				count++;
			}
		}
		if (i == j) {
			System.out.println("same length");
		} else {
			System.out.println("Not same");
		}
	}
}