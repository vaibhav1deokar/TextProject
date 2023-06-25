package com.camparablecomparator;

public class Car implements Comparable<Car> {

	int id, price;
	String name;

	public Car(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public String toString() {
		return id + " " + name + " " + price;
	}

	public int compareTo(Car c) {

//		if (this.price > c.price) { 
//			return -1;
//		} else if (this.price < c.price) {
//			return 1;
//		} else {
//			return 0;
//		}

		return this.name.compareTo(c.name);
	}
}
