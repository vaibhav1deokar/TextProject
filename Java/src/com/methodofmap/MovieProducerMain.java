package com.methodofmap;

import java.util.HashMap;
import java.util.Map;

public class MovieProducerMain {

//	HashMap<Integer, Movie> hm = new HashMap<>();

	void addData(HashMap<Integer, Movie> hm) {

//		hm.put(987, new Movie("RRR",500000,new Produser("Karan johar","9865325421")));
		hm.put(9871, new Movie("RRR", 2000000, new Produser("Karan Johar", "9878789")));
		hm.put(5672, new Movie("Tiger Zinda hai", 3000000, new Produser("Salman Khan", "987878912")));
		hm.put(1234, new Movie("Kal ho na ho", 1500000, new Produser("Karan Johar", "9878789")));
		hm.put(7654, new Movie("Ek Tha Tiger", 3330000, new Produser("Salman Khan", "9878789")));
		hm.put(6789, new Movie("The Kerala Story", 5000000, new Produser("Ajay devgan", "987565689")));
		hm.put(2453, new Movie("Bhola", 2000000, new Produser("Ajay Devgan", "987565689")));
		hm.put(2343, new Movie("Yeh Jawani Hai diwani", 6700000, new Produser("Karan Johar", "9878789")));
		hm.put(1254, new Movie("URI", 8990000, new Produser("Ria Sharma", "987565789")));
		hm.put(9123, new Movie("Ved", 8900000, new Produser("Ritesh deshmukh", "987563423")));
		hm.put(6589, new Movie("Mauli", 7800000, new Produser("Ritesh deshmukh", "987563423")));
	}

	void display(HashMap<Integer, Movie> hm) {
		for (Map.Entry<Integer, Movie> map : hm.entrySet()) {
			if (map.getValue().p.name.equalsIgnoreCase("karan johar")) {
				System.out.println(map.getValue().name);
			}
		}
	}

	public static void main(String[] args) {

		HashMap<Integer, Movie> hm = new HashMap<>();

		MovieProducerMain obj = new MovieProducerMain();
		obj.addData(hm);
		obj.display(hm);
	}
}