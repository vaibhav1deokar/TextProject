package com.wrapperclass;

public class WrapperDemo {
	public static void main(String[] args) {

		int a = 10;
		Integer i = new Integer(a);
		Integer i1 = 10;
		Integer it1 = 100;
		int a1 = it1.intValue();
		System.out.println(a1);
		Integer i2 = 10;
		System.out.println(i1.equals(i));
		Float f1 = 4.5f;
		System.out.println(f1.hashCode());
		Float f2 = f1;
		System.out.println(f2.hashCode());
		Integer t1 = 300;
		int k = t1.intValue();
		float f = t1.floatValue();
		double d = t1.doubleValue();
		long l = t1.longValue();

		System.out.println(f);
	}

}
