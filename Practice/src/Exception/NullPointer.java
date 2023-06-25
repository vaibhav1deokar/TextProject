package Exception;

public class NullPointer {

	void nullInt() {
		
		int a[] = null;
		
		try {
			int b = a[0];
			System.out.println("value : "+b);
		}catch(NullPointerException e) {
			System.out.println("null int exception : "+e.getMessage());
		}
	}
	
	void nullString() {
		String s = null;
		
		try {
			int l = s.length();
			System.out.println("length string is : "+l);
		}catch(NullPointerException e) {
			System.out.println("null string exception : "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		NullPointer obj = new NullPointer();
		obj.nullInt();
		obj.nullString();
		
	}
}
