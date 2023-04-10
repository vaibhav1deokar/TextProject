package overriding;

class A {

	A() {
		System.out.println("constructor a");
	}

}

class B extends A{

	B() {
		super();
		System.out.println("constructor b");
	}
}
class c extends B{
	
	c(){
		super();
		System.out.println("constructor c");
		
	}
}

	
