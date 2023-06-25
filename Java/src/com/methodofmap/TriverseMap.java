package com.methodofmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TriverseMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String>hm = new HashMap<>();
		
		hm.put(5, "meena");
		hm.put(2, "reena");
		hm.put(3, "tina");
		hm.put(4, "shila");
		hm.put(8, "nila");
		
		for(Integer i : hm.keySet()) {
			System.out.println(i);
		}
		
		for(String s : hm.values()) {
			System.out.println(s);
		}
		
		for(Map.Entry<Integer, String>mp : hm.entrySet()) {
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		Set<Map.Entry<Integer, String>> st = hm.entrySet();
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
