
public class Pattern4 {
	public static void main(String[] args) {
		char ch = 'e';
		for (char i = 'a'; i <= ch; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}
}
//a
//b b
//c c c
//d d d d
//e e e e e