package strings;

import java.util.Arrays;

public class Anagram {

	void anagramString(String s1, String s2) {
		if (s1.length() == s2.length()) {
			
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

//			System.out.println(Arrays.toString(c1));
//			System.out.println(Arrays.toString(c2));
		
		int count = 0;
		for(int i = 0; i<c1.length;i++) {
			if(c1[i]==c2[i]) {
				count++;
			}
		}
		if(count == c1.length) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
		else {
			System.out.println("Length not maching");
		}
	}

	public static void main(String[] args) {
		String s1 = "keeep";
		String s2 = "peek";
		
		Anagram obj = new Anagram();
		obj.anagramString(s1, s2);
	}

}
