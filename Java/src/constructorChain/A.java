package constructorChain;

public class A {

	A() {
		this(20);
		System.out.println("default constructor");
	}

	A(int a) {
		this(20, 30);
		System.out.println("1st parametarise constructor");
	}

	A(int a, int b) {
		this(20, 30, 40);
		System.out.println("2nd parametrise constructor");
	}

	A(int a, int b, int c) {
		System.out.println("3rd parametrise constructor");
	}

	public static void main(String[] args) {

		A obj = new A();

	}
}
