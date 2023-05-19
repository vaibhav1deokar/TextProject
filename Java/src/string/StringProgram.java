package string;

public class StringProgram {

	public static void main(String[] args) {

		String a = "Rakesh";
		int count = 0,i;

		for (i = 0; i < a.length(); i++) {
//			System.out.println(a.charAt(i));

			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u') {
				count++;
				System.out.print(a.charAt(i)+" ");
			}
		}
		System.out.println(count);
	}
}
