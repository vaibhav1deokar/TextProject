package com.wrapperclass;

public class WrapperExample {
	
	public static void main(String[] args) {
		
		int a = 10;
//		Integer i = new Integer(a);   //Boxing
		Integer i = a;                //AutoBoxing
		System.out.println(i);        
		
		Integer al = 20;
		int bl = al.intValue();
		System.out.println(bl);
		
		int ai = al;
		System.out.println(ai);
		
		Integer al2 = 10;
		System.out.println(al2.equals(i));
		
		Float f1 = 4.5f;
		System.out.println(f1.hashCode());    //used for map
		
		Float f2 = f1;
		System.out.println(f2);
		System.out.println(f2.hashCode());   //pointed to same location
		
		Integer t1 = 300;
		int k = t1.intValue();         //convert into int value
		System.out.println(k);
		
		Float f = t1.floatValue();
		System.out.println(f);
		
		Double d = t1.doubleValue();
		System.out.println(d);
		
		Long l = t1.longValue();
		System.out.println(l);
		
		
		Integer ig = new Integer(20);
		System.out.println(ig);
		
		Integer ig2 = new Integer("900");
		System.out.println(ig2);
		
		Character c1 = new Character('c');
		System.out.println(c1);
		
		
		
	}

}
