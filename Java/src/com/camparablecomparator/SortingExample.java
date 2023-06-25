package com.camparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
	
	public static void main(String[] args) {
		
		ArrayList<String>name = new ArrayList<>();
		name.add("rakul");
		name.add("vivek");
		name.add("akshay");
		
		System.out.println(name);
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
	}

}
