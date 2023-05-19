package string;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "akash";
		String s2 = "akash";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = new String("akash");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		String s4 = new String("akash");
		System.out.println(s4 == s3);
		System.out.println(s4.equals(s3));

		String s5 = new String("sanket");
		String s6 = s5.intern();
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));

		String s7 = new String();
		if (s7 == null) {
			System.out.println("I am null");
		} else {
			System.out.println("I am not null");
		}
		
		char[] chArr = {'a','b','c','d','e','f','g'};
		String s8 = new String (chArr);
		System.out.println(s8);
		
		char[] chArr1 = {'a','b','c','d','e','f','g'};
		String s9 = new String (chArr1,1,4);
		System.out.println(s9);
		
		String s10 = "nikita";
		System.out.println(s10.hashCode());
		s10 = s10+"khaire";
		System.out.println(s10);
		
	}

}
