package ananomusinnerclass;

class A {
	void display(){
		System.out.println("in class a method");
	}
}

abstract class B {
	abstract void fruit();
	
}

interface C {
	abstract void play();
}

public class AnanomusExample {

	public static void main(String[] args) {
		
		A obja = new A() {
			void display() {
				System.out.println("in ananomus class inner class");
			}
		};
		
		obja.display();
	
	
	B objb = new B() {
		void fruit() {
			System.out.println("fruits are good");
		}
	};
	objb.fruit();
	
	C objc = new C() {
		public void play() {
			System.out.println("all good play");
		}
	};
	objc.play();
}
}