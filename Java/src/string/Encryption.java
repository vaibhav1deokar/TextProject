package string;

public class Encryption {

	public static void main(String[] args) {

		String s = "KITE";

		char ch[] = s.toCharArray();

//		String[] ch1 = s.split(" ");
		int sum = 0;
		int a = 64;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] - a != 0) {
				int b = ch[i] - a;

				sum = sum + b;
				
//				System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}