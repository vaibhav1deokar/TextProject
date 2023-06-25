package com.comparatorcollection;

//import java.util.Comparator;

public class CarMultiSortComparator implements java.util.Comparator<Car>{
	
//	public int Comparator(Car o1,Car o2) {
//		if(o1.company.equalsIgnoreCase(o2.company)) {
//			if(o1.price==o2.price) {
//				return o1.id-o2.id;
//			}
//			else {
//				return o1.price-o2.price;
//			}
//		}
//		else {
//			return o1.company.compareTo(o2.company);
//		}
//	}

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		if(o1.company.equalsIgnoreCase(o2.company)) {
			if(o1.price==o2.price) {
				return o1.id-o2.id;
			}
			else {
				return o1.price-o2.price;
			}
		}
		else {
			return o1.company.compareTo(o2.company);
		}
	}

}
