package com.collectionarrayobject;

import java.util.ArrayList;

public class AuthorBookMain {

	ArrayList<Book> book1 = new ArrayList<>();

	void addData() {

		Author a1 = new Author(12, "Rakesh");
		Author a2 = new Author(23, "Kapil");
		Author a3 = new Author(45, "Sunil");
		Author a4 = new Author(56, "Omkar");

		book1.add(new Book(101, 250, "Goals", a1));
		book1.add(new Book(101, 250, "Dreams", a2));
		book1.add(new Book(101, 250, "Thoughts", a3));
		book1.add(new Book(102, 350, "Works", a4));

	}

	void display() {
		System.out.println(book1);
	}

	void displayInfo() {
		for (Book b : book1) {
			System.out.println(b.name + " " + b.a.name + " " + b.price);
		}
	}

	public static void main(String[] args) {

		AuthorBookMain obj = new AuthorBookMain();
		obj.addData();
		obj.display();
		obj.displayInfo();

	}

}
