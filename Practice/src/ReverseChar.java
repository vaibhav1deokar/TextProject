
public class ReverseChar {
	public static void main(String[] args) {
		char ch = 'e';
		
		for (char i = 'a'; i <= ch; i++) {
			
			for (char j = ch; j >= i; j--) {
				
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

}
//e d c b a
//e d c b
//e d c
//e d
//e