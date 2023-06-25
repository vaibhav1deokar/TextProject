package com.methodofmap;

public class Book1 implements Comparable<Book> {

	int id, price;
	String name;

	public Book1(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public String toString() {
		return id + " " + name + " " + price;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.id = o.id;
	}

}
