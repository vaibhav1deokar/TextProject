package com.collection;

import java.util.ArrayList;

public class StringArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String>al = new ArrayList<>();
		al.add("java");
		al.add("is");
	
		for(String s : al) {
			int l = s.length();
			System.out.println(l);
		}
	}
}