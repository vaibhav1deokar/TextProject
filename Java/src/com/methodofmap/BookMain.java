package com.methodofmap;

import java.util.HashMap;

public class BookMain {

	void addData(HashMap<Book, String> hm) {

		hm.put(new Book(1, 250, "Dreamers"), " Prakash");
		hm.put(new Book(5, 350, "True Thoughts"), " Rakesh");
		hm.put(new Book(7, 100, "Imagnation"), " Pritam");
		hm.put(new Book(3, 90, "Smart Workers"), " Shiv");
		hm.put(new Book(9, 650, "Goals Life"), " Sanskar");
	}

	void display(HashMap<Book, String> hm) {
		System.out.println(hm);
	}

	public static void main(String[] args) {

		HashMap<Book, String> hm = new HashMap<>();

		BookMain obj = new BookMain();
		obj.addData(hm);
		obj.display(hm);

	}

}
