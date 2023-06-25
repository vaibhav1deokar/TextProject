package com.comparatorcollection;

public class Car implements Comparable<Car>{

	int id, price;
	String name, company;

	public Car(int id, int price, String name, String company) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.company = company;
	}

	public String toString () {
		return id+" "+name+" "+company+" "+price;
	}
	
//	@Override
	public int compareTo(Car o) {
		return this.id-o.id;
	}
}
