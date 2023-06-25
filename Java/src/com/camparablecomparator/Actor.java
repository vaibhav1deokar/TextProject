package com.camparablecomparator;

public class Actor {

	int id, age;
	String name;

	
	
	public Actor(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public String toString () {
		return id+" "+name+" "+age;
	}
}
