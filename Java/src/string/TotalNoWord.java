package string;

public class TotalNoWord {

	public static void main(String[] args) { 

		String s = "vaibhav deokar";
		char c, d;

		int count = 1;

		for (int i = 0; i < s.length()-1; i++) {

			c = s.charAt(i);
			d = s.charAt(i + 1);
			if (c == ' ' && d != ' ') {
				count++;
			}
//			System.out.println(count);
		}
		System.out.println(count);
	}
}
