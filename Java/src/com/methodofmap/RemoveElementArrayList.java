package com.methodofmap;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementArrayList {

	// remove all even no.
	void removeElementsArrayList(int a) {

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

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println(al);

	}

	void removeDuplicates() {

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

		ArrayList<Integer> al1 = new ArrayList<>();

		for (Integer i : al) {
			if (!al1.contains(i)) {
				al1.add(i);
			}
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {

		RemoveElementArrayList obj = new RemoveElementArrayList();
		obj.removeElementsArrayList(0);
		
		System.out.println("-------------------------");
		
		obj.removeDuplicates();
	}

}
