package com.wrapperclass;

class A {
	Number test() {
		return 4;
	}
}

public class B {

	Number test() {
		return 45.5;
	}

	void display(int a) {
		System.out.println("Primative int");
	}

	void display(Integer i) {
		System.out.println("Integer class");
	}

	void display(Number a) {
		System.out.println("Number class");
	}

	void display(float a) {
		System.out.println("primative float");
	}

	void display(Float a) {
		System.out.println("Float class");
	}

	public static void main(String[] args) {

		B obj = new B();
		obj.display(200);
		
//		number i  = new Integer (900);
//		 Integer n = (Integer);
	}
}
