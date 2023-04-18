package constructorex;

public class Test {
	
	Test(int a){
		this();
		System.out.println("int argument cons.");
		
	}
	
	Test(String name){
		this();
		System.out.println("String arg cons");
		
	}
	
	Test(double b){
		this();
		System.out.println("double arg cons.");
		
	}
	
	Test(){
		System.out.println("no args cons.");
		
	}
	
	public static void main(String[] args) {
		Test t=new Test(1);
		System.out.println(t);
	}

}
