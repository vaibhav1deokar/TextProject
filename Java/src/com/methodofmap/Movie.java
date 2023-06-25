package com.methodofmap;

public class Movie {

	String name;
	int boc;
	Produser p;

	public Movie(String name, int boc, Produser p) {
		super();
		this.name = name;
		this.boc = boc;
		this.p = p;
	}

	public String toString() {
		return boc+ " " + name + " " + p;
	}

}
