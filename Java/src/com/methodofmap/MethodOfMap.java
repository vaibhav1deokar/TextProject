package com.methodofmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MethodOfMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String>hm = new HashMap<>();
		
		hm.put(5, "meena");
		hm.put(2, "reena");
		hm.put(3, "tina");
		hm.put(4, "shila");
		hm.put(8, "nila");
		
		System.out.println(hm);
		
		System.out.println("contains key :"+hm.containsKey(2));
	
		System.out.println("contains value : "+hm.containsValue("meena"));
		
		System.out.println(hm.replace(4, "minal"));
		
		System.out.println(hm);
		
		System.out.println(hm.getOrDefault(8, "pila"));
		
//		hm.clear();
		
		LinkedHashMap<Integer, String>lhm = new LinkedHashMap<>();

		lhm.put(5, "rahul");
		lhm.put(2, "ramesh");
		lhm.put(3, "rakesh");
		lhm.put(4, "ravi");
		lhm.put(8, "ram");

		hm.putAll(lhm);
		System.out.println(hm);
		
		LinkedHashMap<Integer, String>lhm1 = new LinkedHashMap<>();
		
		lhm1.put(5, "rahul");
		lhm1.put(2, "ramesh");
		lhm1.put(3, "rakesh");
		lhm1.put(4, "ravi");
		lhm1.put(8, "ram");
		
		System.out.println(hm.equals(lhm1));
		hm.remove(3);
		System.out.println(hm);
		
		System.out.println(hm.get(70));
		
	}

}
