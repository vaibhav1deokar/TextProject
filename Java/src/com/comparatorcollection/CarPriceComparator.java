package com.comparatorcollection;
import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

//	public int Comparator(Car c1, Car c2) {
//
////		return c1.price-c2.price;   // for acending...
//
//		// for decending....
//
//		if (c1.price > c2.price) {
//			return -1;
//		} else if (c1.price < c2.price) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}

	@Override
	public int compare(Car c1, Car c2) {
		// TODO Auto-generated method stub
//		return c1.price-c2.price;   // for acending...

		// for decending....

		if (c1.price > c2.price) {
			return -1;
		} else if (c1.price < c2.price) {
			return 1;
		} else {
			return 0;
		}
	}
}