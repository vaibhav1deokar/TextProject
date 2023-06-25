package com.collectionarrayobject;

public class Author {
	
	int id;
	String name;

	public Author(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString () {
		return id+" "+name;
	}

}
