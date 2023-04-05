package staticclass;

public class Demo {
	
	int a =100;
	static int b =1000;
	
	void display() {
		System.out.println(a+" "+b);
	}
	
	static void show() {
		System.out.println(" "+b);
		Demo d = new Demo();
		System.out.println(d.a);
		
	}
	
	

}
