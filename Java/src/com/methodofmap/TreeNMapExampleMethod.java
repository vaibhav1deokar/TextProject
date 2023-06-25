package com.methodofmap;

import java.util.TreeMap;

public class TreeNMapExampleMethod {

	void addData(TreeMap<Integer, String> tm) {

		tm.put(2, "Raj");
		tm.put(24, "Sahil");
		tm.put(8, "Mahi");
		tm.put(1, "Manoj");
		tm.put(95, "Lalit");
		tm.put(34, "Sandip");
		tm.put(29, "Ganan");
		tm.put(57, "Omkar");

		System.out.println(tm);
		System.out.println(tm.headMap(8));
		System.out.println(tm.tailMap(29));
		System.out.println(tm.higherEntry(5));
		System.out.println(tm.lowerEntry(34));
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());

		System.out.println(tm.floorEntry(24));
		System.out.println(tm.floorKey(55));

		System.out.println(tm.ceilingEntry(34));
		System.out.println(tm.ceilingKey(29));

		System.out.println(tm.descendingMap());
	}

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();

		TreeNMapExampleMethod obj = new TreeNMapExampleMethod();
		obj.addData(tm);
	}

}
