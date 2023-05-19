package stringpractice;

public class VowelCaseChange {

	public static void main(String[] args) {

		String s = "java programming";

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = (char) (ch[i] - 32);
			}
//			String s1 = new String (ch);
//			System.out.println(s1);
		}
		String s1 = new String (ch);
		System.out.println(s1);
	}

}
