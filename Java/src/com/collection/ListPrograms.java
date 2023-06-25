package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListPrograms {

	void addElement(ArrayList<Integer> al1) {
//		al1.clear();
//		al1.add(1000);
//		al1.add(2000);

		int sum = 0;
		for (Integer i : al1) {
			sum = sum + i;
		}
		System.out.println("Addition is : " + sum);
	}

	void frequency(ArrayList<Integer> al1) {
		int a = 10;
		System.out.println("Frequency of 10 : " + Collections.frequency(al1, a));
	}

	void frequencyEachElement(ArrayList<Integer> al1) {
		Integer arr[] = new Integer[al1.size()];
		al1.toArray(arr);
		System.out.println(Arrays.toString(arr));

		Boolean b[] = new Boolean[al1.size()];
		Arrays.fill(b, true);

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
					b[j] = false;
				}
//				System.out.println(arr[i]+" "+ count);
			}
			if (b[i] == true) {
				System.out.println(arr[i] + " " + count);

//			System.out.println(Arrays.toString(arr));
//			System.out.println(Arrays.toString(b));
			}
		}
	}

	void removeDuplicate(ArrayList<Integer> al1) {
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer i : al1) {
			if (!list.contains(i)) {
				list.add(i);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(91);
		al.add(77);
		al.add(101);
		al.add(93);
		al.add(76);
		al.add(100);
		al.add(90);
		al.add(16);
		al.add(10);
		al.add(91);
		al.add(77);
		al.add(101);
		al.add(93);
		al.add(76);
		al.add(512);

		System.out.println(al);
		System.out.println("====================");

		ListPrograms obj = new ListPrograms();

		obj.addElement(al);
		System.out.println("-------------");

		obj.frequency(al);
		System.out.println("--------------");

		obj.frequencyEachElement(al);
		System.out.println("---------------");

		obj.removeDuplicate(al);

	}

}
