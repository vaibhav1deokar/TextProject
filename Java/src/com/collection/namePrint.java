package com.collection;

import java.util.LinkedList;

public class namePrint {
	
	public static void main(String[] args) {
		
		LinkedList<String>s = new LinkedList<>();
		
		s.add("Raj");
		s.add("Riya");
		s.add("Rohan");
		s.add("Seema");
		s.add("Meera");
		
		for(String c : s) {
		System.out.println(c.startsWith(c, 'R'));
		if(c.startsWith(c)) {
			System.out.println();
		}
		}
		
	}

}
