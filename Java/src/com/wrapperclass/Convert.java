package com.wrapperclass;

public class Convert {
	public static void main(String[] args) {

		Integer s = new Integer("100");
		byte b = s.byteValue();
		int i = s.intValue();
		short h = s.shortValue();
		float f = s.floatValue();
		double d = s.doubleValue();

		System.out.println(b + " " + i + " " + h + " " + f + " " + d);

	}
}