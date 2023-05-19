package stringpractice;

public class CountCharNoSymb {

	public static void main(String[] args) {
		String s = "Java@321Lan%%#@Gu12sge";

		int i, count = 0, num = 0, sym = 0;

		char ch[] = s.toCharArray();

		for (i = 0; i < s.length(); i++) {
			if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
				count++;
			}
//			else if(ch[i]>0) {
//				count++;
//			}
//			System.out.println(count);
		}
		System.out.println("Count of char : "+count);

		for (i = 0; i < s.length(); i++) {
			if ((ch[i] >= '0') && (ch[i] <= '9')) {
				num++;
			}
		}
		System.out.println("Count of number : "+num);

		for (i = 0; i < s.length(); i++) {
			if (ch[i] == '!' || ch[i] == '@' || ch[i] == '#' || ch[i] == '$' || ch[i] == '%' || ch[i] == '&'
					|| ch[i] == '*') {
				sym++;
			}
		}
		System.out.println("Count of symbols :"+sym);
	}

}
