package com.camparablecomparator;

import java.util.ArrayList;

//import com.collectionarrayobject.Book;
//import com.collectionarrayobject.Employee;

public class MovieActorMain {

	ArrayList<Actor> a = new ArrayList<>();

	void addData(ArrayList<Movie> mov) {

		ArrayList<Actor> a = new ArrayList<>();
		a.add(new Actor(12, 35, "Sharukh Khan"));

		ArrayList<Actor> a1 = new ArrayList<>();
		a1.add(new Actor(32, 45, "Salman Khan"));

		ArrayList<Actor> a2 = new ArrayList<>();
		a2.add(new Actor(45, 50, "Prabhas"));

		ArrayList<Actor> a3 = new ArrayList<>();
		a3.add(new Actor(69, 30, "Ayushman Khurana"));

		ArrayList<Actor> a4 = new ArrayList<>();
	    a4.add(new Actor(78, 40, "Kapil Sharma"));

		mov.add(new Movie(101, 5000000, "Pathan", a));
		mov.add(new Movie(156, 7000000, "Bodyguard", a1));
		mov.add(new Movie(189, 9000000, "Wanted", a1));
		mov.add(new Movie(112, 3000000, "DDLG", a));
		mov.add(new Movie(123, 8000000, "Bahubali", a2));

	}

	void searchData(ArrayList<Movie> mov) {
		for (Movie m : mov) {
			for(Actor a1 : m.a) {
			if (a1.name.equalsIgnoreCase("Salman khan")) {
				System.out.println(m);
			}
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Movie> mov = new ArrayList<>();

		MovieActorMain obj = new MovieActorMain();
		obj.addData(mov);
		obj.searchData(mov);
//		System.out.println(mov);
	}

}
