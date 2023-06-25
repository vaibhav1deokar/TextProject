package com.methodofmap;

import java.util.TreeMap;

public class Book1Main {

	void addData(TreeMap<Book, String> tm) {

		tm.put(new Book(56, 550, "Let us c"), "Yash");
		tm.put(new Book(87, 500, "Dreamers"), "Mahi");
		tm.put(new Book(21, 650, "Gamers"), "harshal");
		tm.put(new Book(93, 350, "Traveller"), "Prakash");
		tm.put(new Book(84, 850, "Campaning"), "Gagan");
		tm.put(new Book(90, 700, "Achive Goals"), "Rakul");
		tm.put(new Book(34, 650, "Motivated"), "Samir");

	}

	void display(TreeMap<Book, String> tm) {
		System.out.println(tm);
	}

	public static void main(String[] args) {

		TreeMap<Book, String> tm = new TreeMap<>(new BookPriceComparator());

		Book1Main obj = new Book1Main();
		obj.addData(tm);
		obj.display(tm);
	}
}
