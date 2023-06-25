package com.comparatorcollection;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {

	void addData(ArrayList<Car> cr) {

		cr.add(new Car(12, 500000, "swift", "Maruti"));
		cr.add(new Car(65, 900000, "Punch", "Tata"));
		cr.add(new Car(87, 3500000, "Fortuner", "Toyota"));
		cr.add(new Car(32, 1200000, "Nexon", "Tata"));
		cr.add(new Car(54, 1600000, "Creta", "Hondai"));
		cr.add(new Car(21, 2000000, "Harier", "Tata"));
		cr.add(new Car(98, 2500000, "Safari", "Tata"));
		cr.add(new Car(26, 800000, "Altroz", "Tata"));
		cr.add(new Car(94, 700000, "Ertiga", "Maruti"));
		cr.add(new Car(35, 4000000, "Endeavour", "Ford"));
		cr.add(new Car(61, 5000000, "XC90", "Volvo"));

	}
	
	void display(ArrayList<Car> cr) {
		
		Collections.sort(cr);
		
		for(Car c : cr) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {

		ArrayList<Car> cr = new ArrayList<>();

		CarMain obj = new CarMain();
	}
}