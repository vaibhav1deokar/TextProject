package innerclassesinjava;

public class StaticOuter {
	
	int a = 100;
	static int b = 2000;
	
	static class staticInner {
		void display() {
			int c = 100;
//			System.out.println(a);
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		StaticOuter.staticInner obj = new staticInner();
		obj.display();
	}

}
