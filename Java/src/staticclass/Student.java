package staticclass;

public class Student {

	int id, marks;
	String name, dept;
	static String collagename = "RJ collage of Engineering";

	Student(int id, int marks, String name, String dept) {
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.dept = dept;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + marks;
	}

	static void collageName() {
		System.out.println("RJ collage of Engineering");

	}

}
