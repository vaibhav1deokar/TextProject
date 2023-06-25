package com.methodofmap;

public class Produser {

	String name, contact;

	public Produser(String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
	}

	public String toString() {
		return name + " " + contact;
	}
}
