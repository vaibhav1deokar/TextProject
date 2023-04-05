package Written3;

public class OverLoad {
	
	void compare(int a, int b) {
		
		if(a>b) {
			System.out.println("Greater no. is = "+a);
		}
		else {
			System.out.println("Greater no. is = "+b);
		}
	}
	
	void compare(char ch, char bh) {
		if(ch>bh) {
			System.out.println("Greater Character is = "+ch);
		}
		else {
			System.out.println("Greater Character is = "+bh);
		}
	}
	
	public static void main(String[] args) {
		
		OverLoad obj = new OverLoad ();
		
		obj.compare(5, 8);
		obj.compare('a', 'g');
	}

}
