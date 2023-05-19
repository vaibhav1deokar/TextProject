package exceptionhandaling;

public class StringLength {
	
	int getstringlength (String s) {
		
		if(s==null) {
			throw new NullPointerException("String is null ......enter valid String");
		}
		return s.length();
	}
	
	public static void main(String[] args) {
		StringLength s1 = new StringLength();
		System.out.println(s1.getstringlength("india"));
//		System.err.println(s1.getstringlength(null));
		try {
		System.out.println(s1.getstringlength(null));
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(s1.getstringlength("java"));
		System.out.println(s1.getstringlength("language"));
	}

}
