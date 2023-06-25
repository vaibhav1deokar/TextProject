package com.collectionarrayobject;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailFastItarator {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(52);
		a1.add(95);
		a1.add(65);
		a1.add(45);
		a1.add(10);
		a1.add(52);
		a1.add(95);
		a1.add(65);
//		a1.add(45);
//		a1.add(10);
//		a1.add(52);
//		a1.add(95);
//		a1.add(65);
//		a1.add(45);

		/*
		 * for(Integer i : a1) { if(i==10) { a1.add(100); } }
		 */

		ListIterator<Integer> litr = a1.listIterator();

		while (litr.hasNext()) {
			if (litr.next() == 10) {
				litr.add(10000);
//				litr.set(5555);
//				litr.remove();
			}
		}
		System.out.println(a1);
	}

}
