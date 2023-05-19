package stringpractice;

public class UpperLower {
	
	public static void main(String[] args) {
		
		String s ="JaVa";
		int i ;
		char ch[] = s.toCharArray();
		for(i = 0; i<s.length();i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch [i] = (char) (ch[i]+32);
			}else if(ch[i]>='a'&&ch[i]<='z') {
				ch[i] = (char) (ch[i]-32);
			}
			System.out.print(ch[i]);
		}
		System.out.println(i);
	}
}