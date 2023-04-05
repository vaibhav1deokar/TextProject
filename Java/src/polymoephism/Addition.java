package polymoephism;

public class Addition {

	void addition(int a, int b) {
		System.out.println("Addition is = " + (a + b));
	}

	void addition(int a, int b, int c) {
		System.out.println("Addition is = " + (a + b + c));
	}

	void addition(String a, String b) {
		System.out.println("Additoin is  = " + (a + b));
	}

	void addition(int a, String b) {
		System.out.println("Addition is = " + (a + b));
	}

	void addition(String a, int b) {
		System.out.println("Addition is = " + (a + b));
	}

	public static void main(String[] args) {

		Addition a1 = new Addition();
		a1.addition(5, 6);
		a1.addition("xyz", 25);
		a1.addition(245, "pqr");
		a1.addition("abc", "def");
		a1.addition(25, 60, 70);
	}
}
