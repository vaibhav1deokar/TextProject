package constructorex;

public class Test2 extends Test{
	
	Test2(float a){
		super();
		System.out.println("String arg cons");
		
	}
	
	Test(long b){
		this();
		System.out.println("double arg cons.");
		
	}
	
	public static void main(String[] args) {
		
		Test2 t= new Test2(12.3f);
		System.out.println(t);
		
	}

}
