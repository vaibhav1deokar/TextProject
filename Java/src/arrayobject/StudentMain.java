package arrayobject;

import java.util.Scanner;

public class StudentMain {
	Scanner sc = new Scanner(System.in);

	Student st[] = new Student[15];

	void addStudentData() {

		/*
		 * for (int i = 0; i < 3; i++) {
		 * System.out.println("Enter id, name, dept, mark " + (i + 1) + " student"); int
		 * id = sc.nextInt(); String name = sc.next(); String dept = sc.next(); double
		 * mark = sc.nextDouble();
		 * 
		 * Student s = new Student(id, name, dept, mark);
		 * 
		 * st[i] = s; }
		 */

		st[0] = new Student(12, "Raj", "Computer", 70, "9865325421");
		st[1] = new Student(120, "Riya", "Computer", 56, "8754216532");
		st[2] = new Student(1, "Arjun", "Civil", 70, "9562845162");
		st[3] = new Student(45, "Karan", "ENTC", 60, "8451956251");
		st[4] = new Student(23, "Rahul", "Computer", 60, "7485965263");
		st[5] = new Student(5, "Anjali", "Computer", 65.5f, "9764315421");
		st[6] = new Student(78, "Riya", "ENTC", 50, "9062847452");
		st[7] = new Student(167, "Ramesh", "Mechanical", 55, "8495303020");
		st[8] = new Student(50, "Suresh", "Mechanical", 60, "8090705060");
		st[9] = new Student(145, "Nilima", "Civil", 70, "7586425310");
	}

	void addDataStudent() {
		for (int i = 0; i < 15; i++) {

			if (st[i] == null) {
				System.out.println("Enter id, name, dept, mark" + (i + 1) + " student");
				int id = sc.nextInt();
				String name = sc.next();
				String dept = sc.next();
				double mark = sc.nextDouble();
				String contact = sc.next();

				Student std = new Student(id, name, dept, mark, contact);

				st[i] = std;

				break;
			}
		}
	}

	void updateData() {
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("what do you wnat to update : (contact/marks)");
		String data = sc.next();
		if (data.equalsIgnoreCase("contact")) {
			System.out.println("Enter the new contact : ");
			String con = sc.next();
			for (Student s : st) {
				if (s != null) {
					if (s.id == id) {
						s.contact = con;
					}
				}
			}
		}
	}
	
	void bySwitchCase() {
		System.out.println("Enter id");
		
		char a = 'm';
		int id = sc.nextInt();
		
		switch(a) {
		case 'c' :
//			
			System.out.println("Enter the updated contact");
			String con = sc.next();
			
			for (Student s : st) {
				if (s != null) {
					if (s.id == id) {
						s.contact = con;
					}
				}
			}
		case 'm' :
//			
			System.out.println("Enter updated marks");
			double mrk = sc.nextDouble();

			for (Student s : st) {
				if (s != null) {
					if (s.id == id) {
						s.mark = mrk;
					}
				}
			}
		}
	}

	void updateMark() {
		System.out.println("Enter id");
		int id = sc.nextInt();

		System.out.println("Enter updated marks");
		double mrk = sc.nextDouble();

		for (Student s : st) {
			if (s != null) {
				if (s.id == id) {
					s.mark = mrk;
				}
			}
		}
	}

	void deleteData() {
		System.out.println("Enter the student id : ");
		int id = sc.nextInt();
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				if (st[i].id == id) {
					st[i] = null;
					break;
				}
			}
		}

	}

	void searchDeptWise() {
		for (Student s : st) {
			if (s != null) {
				if (s.dept.equalsIgnoreCase("civil")) {
					System.out.println(s);

				}
			}
		}
	}

	void greater60() {
		for (Student s : st) {
			if (s != null) {
				if (s.mark > 60) {
					System.out.println(s);
				}
			}
		}
	}

	void displayArray() {
		for (Student s : st) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		StudentMain std = new StudentMain();

		std.addStudentData();
//		std.addDataStudent();
//		std.searchDeptWise();
//		std.greater60();
//		std.deleteData();
//		std.updateData();
//		std.updateMark();
		std.bySwitchCase();

		
		std.displayArray();

	}

}
