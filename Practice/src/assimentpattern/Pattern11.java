package assimentpattern;

public class Pattern11 {
	public static void main(String[] args) {

		char ch = 'F';
		for (char i = ch; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		for (char i = 'A'; i <= ch; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

}
//A B C D E F
//A B C D E
//A B C D
//A B C
//A B
//A
//A
//A B
//A B C
//A B C D
//A B C D E
//A B C D E F