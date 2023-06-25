package com.collectionarrayobject;

public class Book {

	int id, price;
	String name;
	Author a;

	public Book(int id, int price, String name, Author a) {
//		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.a = a;
	}

	public String toString () {
		return id+" "+name+" "+price+" "+a;
	}
}
