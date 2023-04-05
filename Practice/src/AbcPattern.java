
public class AbcPattern {
	public static void main(String[] args) {
		
		char ch = 'e';
		
		for (char i = 'a'; i <= ch; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

}
//a
//a b
//a b c
//a b c d
//a b c d e
