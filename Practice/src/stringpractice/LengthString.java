package stringpractice;

public class LengthString {
	
	public static void main(String[] args) {
	
	String s = "java";
	int count = 0;
	for(int i = 0; i<s.length();i++) {
		if(s.charAt(i)!=0) {
			count++;
		}
//		System.out.println(count);
	}
	System.out.println(count);
}
}