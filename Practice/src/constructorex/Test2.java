package constructorex;

public class Test2 extends Test{
	float a;
	Test2(float a){
		super();
		this.a=a;
		System.out.println("String arg cons");
		
	}
	
//	public String toString () {
//		return a;
//	}
	
//	Test(long b){
//		this();
//		System.out.println("double arg cons.");
//		
//	}
	
	public static void main(String[] args) {
		
		Test2 t= new Test2(12.3f);
		System.out.println(t);
		
	}

}
