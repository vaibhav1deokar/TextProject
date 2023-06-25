package com.collection;

import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(91);
		al.add(77);
		al.add(101);
		al.add(93);
		al.add(76);
		al.add(100);
		al.add(90);
		al.add(16);
		al.add(10);
		al.add(91);
		al.add(77);
		al.add(101);
		al.add(93);
		al.add(76);

		System.out.println(al);
//		for(Integer i : al) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		al.add(2, 1000);
//		System.out.println(al);

		System.out.println(al.contains(60));
		System.out.println(al.indexOf(91));
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.isEmpty());
		
//		al.clear();
//		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.set(1, 25000);
		System.out.println(al);
		
		ArrayList<Integer>list = new ArrayList<>();
	
		list.add(7000);
		list.add(8000);
		list.add(9000);
		list.add(1000);
		
		al.addAll(list);
		System.out.println(al);
		
		System.out.println(al.containsAll(list));
		
		al.retainAll(list);
		System.out.println(al);
		
		al.removeAll(list);
		System.out.println(al);
		
		ArrayList<Integer>list2 = new ArrayList<>();
		list2.add(7000);
		list2.add(8000);
		list2.add(9000);
		list2.add(1000);
		
		System.out.println(al.equals(list));
		
	}

}
