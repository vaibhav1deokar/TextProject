package collectionmap;

import java.util.ArrayList;
import java.util.HashMap;

public class MovieMain {
	
	void addData() {
		
		ArrayList<Movie> mov = new ArrayList<>();
		
		mov.add(new Movie(101,5000000,"Padmavati","Sanjay Bansali"));
		mov.add(new Movie(102,8000000,"Ram-Leela","Sanjay Bansali"));
		mov.add(new Movie(103,6000000,"Gangubai","Sanjay Bansali"));
		mov.add(new Movie(104,3000000,"Gumrah","Mahesh Bhatt"));
		mov.add(new Movie(105,4000000,"Sadak2","Mahesh Bhatt"));
		mov.add(new Movie(106,5000000,"Aashiqui","Mahesh Bhatt"));
		mov.add(new Movie(107,6000000,"Agneepath","Karan Johar"));
		mov.add(new Movie(108,9000000,"Dhadak","Karan Johar"));
		mov.add(new Movie(109,3000000,"Ittefaq","Karan Johar"));
		mov.add(new Movie(110,4000000,"Shandaar","Karan Johar"));
		
		HashMap<String, Integer> hm = new HashMap<>();

		for (Movie m : mov) {
			String p = m.producername;
			if (hm.containsKey(p)) {
				int x = hm.get(p);
				x = x + 1;
				hm.put(p, x);
			} else {
				hm.put(p, 1);
			}
		}
		System.out.println(hm);
	}
	
	
	public static void main(String[] args) {
		
		
		
		MovieMain obj = new MovieMain();
		obj.addData();
		
	}

}
