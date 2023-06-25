package com.wrapperclass;

public class MethodWrapperClass {
	
	public static void main(String[] args) {
		
		System.out.println(Integer.compare(100, 200));   //1  ,0  -1
		
		System.out.println(Integer.max(200, 500));
		System.out.println(Integer.min(200, 500));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.reverse(756));
		
		System.out.println(Integer.toBinaryString(5));
		
		System.out.println(Integer.toHexString(1101));
		
		System.out.println("======================");
		
		System.out.println(Character.isUpperCase('A'));
		
		System.out.println(Character.isDigit('0'));
		
		System.out.println("Is Alphabate : " + Character.isLetter('f'));
		
		int a = Character.getNumericValue('6');
		System.out.println(a);
		
		System.out.println("is space : "+Character.isSpace('d'));
		
		
	}

}
