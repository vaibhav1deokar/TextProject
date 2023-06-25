
package com.exception;

public class Demo {
	
	void div (int a , int b) throws ArithmeticException{
	int c;
		if(b==0) {
			throw new ArithmeticException("the value of b is zero");
		}
		else {
			c = a/b;
			System.out.println(c);
		}
	}
	
	
	public static void main(String[] args) {
		Demo obj = new Demo ();
		try {
		obj.div(20, 0);
		}catch(Exception e) {
			e.printStackTrace();
//			System.out.println("the value of b is zero");
		}
	}

}
