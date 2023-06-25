package com.methodofmap;

public class Book {

	int id, price;
	String name;

	public Book(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public String toString() {
		return id + " " + name + " " + price;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		Book b = (Book) o;
		if (this.id == b.id) {
			return true;
		} else {
			return false;
		}

	}

}
