package com.collection.itration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingList {

	public static void main(String[] args) {

		ArrayList<Character> ch = new ArrayList<>();
		ch.add('a');
		ch.add('d');
		ch.add('f');
		ch.add('k');
		ch.add('w');
		ch.add('a');
		ch.add('h');
		ch.add('s');

//		ArrayList<Character> ch1 = new ArrayList<>();
//		System.out.println(ch1);

		System.out.println(ch);
		System.out.println("=======================");

		System.out.println("Normal ForLoop..!!");
		for (int i = 0; i < ch.size(); i++) {
			System.out.print(ch.get(i)+" ");
		}

		System.out.println("\n---------------------");

		System.out.println("Advance for loop..!!");
		for (Character i : ch) {
			System.out.print(i + " ");
		}

		System.out.println("\n------------");

		System.out.println("Iterator for collection..!!");
		Iterator<Character> itr = ch.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
//			itr.remove();
//			itr.hasNext();
//			itr.next();
		}

		System.out.println("\n----------------");

		System.out.println("List iterator for list only forward..!!");
		ListIterator<Character> litr = ch.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}

		System.out.println("\n-------------------");

		System.out.println("list iterator for list only backword..!!");
		ListIterator<Character> listitr = ch.listIterator(3);
		while (listitr.hasNext()) {
			System.out.print(listitr.next() + " ");
		}

//		ListIterator<Character> listitr1 = ch.listIterator(ch.size());
//
//		while (listitr1.hasPrevious()) {
//			System.out.println(listitr1.next());
//			listitr.add('x');
//			listitr.remove();
//			listitr.set('k');
//		}
		
	}

}
