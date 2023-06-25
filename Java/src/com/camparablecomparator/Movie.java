package com.camparablecomparator;

import java.util.ArrayList;

public class Movie {

	int id, boc;
	String name;
	ArrayList<Actor> a;

	public Movie(int id, int boc, String name, ArrayList<Actor> a) {
		this.id = id;
		this.boc = boc;
		this.name = name;
		this.a = a;
	}

	void addData() {
		a.add(new Actor(12, 35, "Sharukh Khan"));
		a.add(new Actor(32, 45, "Salman Khan"));
		a.add(new Actor(45, 50, "Prabhas"));
		a.add(new Actor(69, 30, "Ayushman Khurana"));
		a.add(new Actor(78, 40, "Kapil Sharma"));
	}

	public String toString() {
		return id + " " + name + " " + boc + " " + a;
	}
}
