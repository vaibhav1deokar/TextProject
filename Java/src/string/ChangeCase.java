package string;

public class ChangeCase {
	public static void main(String[] args) {

		String s = "I like java programming";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = (char) (ch[i] - 32);
//			System.out.println(ch[i]);
			} else if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				ch[i] = (char) (ch[i] + 32);
//			System.out.println(ch[i]);
			}
		}
		String s1 = new String(ch);
		System.out.println(s1);
	}
}