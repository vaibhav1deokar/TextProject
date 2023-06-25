package com.wrapperclass;

public class ValueOfMethod {
	
	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(10);     //AutoBoxing
		System.out.println(i);
		
		Integer i1 = Integer.valueOf("6000");
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf("012345", 6);  //not greater than 6.....
		System.out.println(i2);
		
		String s = "8000";
		int x = Integer.parseInt(s);
		System.out.println(x);
		
		float f = Float.parseFloat(s);
		System.out.println(f);
		
		double d = Double.parseDouble(s);
		System.out.println(d);
		
	}

}
