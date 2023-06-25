package com.collectionarrayobject;

import java.util.ArrayList;

public class StudentCanMain {

	ArrayList<StudentCan1> stud = new ArrayList<>();

	void addData() {

		ArrayList<Integer> m1 = new ArrayList<>();
		m1.add(76);
		m1.add(56);
		m1.add(75);
		m1.add(50);

		ArrayList<Integer> m2 = new ArrayList<>();
		m2.add(65);
		m2.add(88);
		m2.add(65);
		m2.add(98);

		ArrayList<Integer> m3 = new ArrayList<>();
		m3.add(54);
		m3.add(78);
		m3.add(65);
		m3.add(49);

		ArrayList<Integer> m4 = new ArrayList<>();
		m4.add(87);
		m4.add(65);
		m4.add(69);
		m4.add(50);

		stud.add(new StudentCan1(1, "nayan", "cs", m1));
		stud.add(new StudentCan1(2, "rakesh", "Mech", m2));
		stud.add(new StudentCan1(3, "kapil", "It", m3));
		stud.add(new StudentCan1(4, "ganesh", "Civil", m4));

	}

	void display() {
		System.out.println(stud);
	}

	void displayPersentage() {
		for (StudentCan1 s : stud) {
			int total = 0;
			for (Integer i : s.marks) {
				total = total + i;
			}
			float per = total / s.marks.size();

			System.out.println(s.name + " " + s.dept + " " + per);
		}
	}

	public static void main(String[] args) {

		StudentCanMain obj = new StudentCanMain();
		obj.addData();
		obj.display();
		obj.displayPersentage();

	}

}
