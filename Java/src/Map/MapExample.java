package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		
//		HashMap<K, V>
		HashMap<Integer, String>hm = new HashMap<>();
		
		hm.put(5, "Raj");
		hm.put(8, "Riya");
		hm.put(9, "Anjali");
		hm.put(1, "Sonali");
		hm.put(2, "Rahul");
		hm.put(4, "Shivani");
		hm.put(6, "Arti");
		hm.put(3, "Nayan");

		System.out.println(hm);
		
		LinkedHashMap<Integer, String>lhm = new LinkedHashMap<>();
		lhm.put(5, "Raj");
		lhm.put(8, "Riya");
		lhm.put(9, "Anjali");
		lhm.put(1, "Sonali");
		lhm.put(2, "Rahul");
		lhm.put(4, "Shivani");
		lhm.put(6, "Arti");
		lhm.put(3, "Nayan");
		
		System.out.println(lhm);
		
		TreeMap<Integer, String>tm = new TreeMap<>();
		
		tm.put(5, "Raj");
		tm.put(8, "Riya");
		tm.put(9, "Anjali");
		tm.put(1, "Sonali");
		tm.put(2, "Rahul");
		tm.put(4, "Shivani");
		tm.put(6, "Arti");
		tm.put(3, "Nayan");
		
		System.out.println(tm);
	}

}
