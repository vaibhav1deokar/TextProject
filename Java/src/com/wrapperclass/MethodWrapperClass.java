package com.wrapperclass;

public class MethodWrapperClass {
	
	public static void main(String[] args) {
		
		System.out.println(Integer.compare(100, 200));
		
		System.out.println(Integer.max(200, 100));
		
		System.out.println(Integer.min(500, 200));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.reverse(765));
		
		System.out.println(Integer.toBinaryString(5));
		
		System.out.println(Integer.toHexString(1101));
		
		System.out.println("==================================");
		
		System.out.println(Character.isUpperCase('a'));
		
		System.out.println(Character.isDigit('5'));
		
		System.out.println("is alphabate :"+Character.isLetter('0'));
		
		int a = Character.getNumericValue('(');
		System.out.println(a);
		
		System.out.println("is space :"+Character.isWhitespace('\n'));
		
		System.out.println("space symbol : "+Character.isSpace(' '));
		
		System.out.println("space symbol : "+Character.isJavaIdentifierPart('#'));
	}

}
