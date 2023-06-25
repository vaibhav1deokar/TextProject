package com.collection;

import java.util.ArrayList;

public class NonGenericCollection {
	
	void nonGenericExample() {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(106);
	al.add(350);
	al.add(610);
	al.add("abc");
	al.add(78.5f);
	al.add(20);
	al.add(56.15);
	al.add("pqr");
	al.add("xyz");
	al.add('b');
	al.add('s');
	al.add('v');
	
	al.add(new Student(101,"raj"));
	al.add(new Student(102,"riya"));
	
	for(Object o : al) {
//		System.out.println(o);
//		System.out.println(o+" "+o.getClass().getSimpleName());
		if(o.getClass().getSimpleName().equals("Integer")) {
			System.out.println(o);
		}
	}
	}
	
	void genericExample() {
		ArrayList<Integer>al = new ArrayList<>();
		
		al.add(10);
		al.add(91);
		al.add(77);
		al.add(101);
		al.add(93);
		al.add(76);
		al.add(100);
		al.add(90);
		al.add(16);
		
		for(Integer i : al) {
//			System.out.println(i);
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
	
		NonGenericCollection obj = new NonGenericCollection();
		obj.nonGenericExample();
		
		System.out.println("===========================");
		
		obj.genericExample();
	}

}
