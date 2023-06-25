package com.camparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {
	
	void addData(ArrayList<Car>c1) {
		
		c1.add (new Car(101, 500000,"Tiago"));
		c1.add (new Car(108, 900000,"Nexon"));
		c1.add (new Car(102, 700000,"Altroz"));
		c1.add (new Car(106, 300000,"Nano"));
		c1.add (new Car(104, 400000,"swift"));
		c1.add (new Car(109, 800000,"Tigor"));
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Car>c1= new ArrayList<>();
		
		CarMain obj = new CarMain();
		obj.addData(c1);
		
		Collections.sort(c1);
		System.out.println(c1);
		
		
	}

}
