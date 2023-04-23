package arrayobject;

import java.util.Scanner;

public class FacultyMain {

	Scanner sc = new Scanner(System.in);

	Faculty fc[] = new Faculty[15];

	void facultyData() {
		fc[0] = new Faculty(12, 50000, "Computer", "raj@gmail.com", "Raj");
		fc[1] = new Faculty(13, 60000, "mechanical", "raju@gmail.com", "Raju");
		fc[2] = new Faculty(14, 70000, "it", "viky@gmail.com", "viky");
		fc[3] = new Faculty(15, 80000, "Computer", "harshal@gmail.com", "harshal");
		fc[4] = new Faculty(16, 90000, "entc", "sunil@gmail.com", "sunil");
		fc[5] = new Faculty(17, 40000, "Civil", "umesh@gmail.com", "umesh");
		fc[6] = new Faculty(18, 70000, "textlite", "kapil@gmail.com", "kapil");
		fc[7] = new Faculty(19, 50000, "civil", "lala@gmail.com", "lala");
		fc[8] = new Faculty(20, 90000, "Computer", "vijram@gmail.com", "vikram");
	}

	void deleteData() {
		System.out.println("Enter id");
		int id = sc.nextInt();

		for (int i = 0; i < fc.length; i++) {
			if (fc[i] != null) {
				if (fc[i].id == id) {
					fc[i] = null;
					break;
				}
			}
		}
	}

	void updateData() {
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter the updated email");
		String emaill = sc.next();
		for (Faculty f : fc) {
			if (f != null) {
				if (f.id == id) {
					f.email = emaill;
				}
			}
		}
	}

	void display() {
		for (Faculty f : fc)
			System.out.println(f);
	}

	public static void main(String[] args) {

		FacultyMain f = new FacultyMain();
		f.facultyData();
		f.updateData();
//		f.deleteData();
		f.display();

	}

}
