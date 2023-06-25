package com.wrapperclass;

public class Convert1 {

	public static void main(String[] args) {
		
		String s = "100";

		byte b = Byte.parseByte(s);
		System.out.println("convert byte: " + b);

		int n = Integer.parseInt(s);
		System.out.println("convert Int: " + n);

		short h = Short.parseShort(s);
		System.out.println("convert Short: " + h);

		float f = Float.parseFloat(s);
		System.out.println("convert Float: " + f);

		double d = Double.parseDouble(s);
		System.out.println("convert Double: " + d);
	}
}
