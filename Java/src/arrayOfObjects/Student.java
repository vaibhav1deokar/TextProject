package arrayOfObjects;

public class Student {

	int id, rollno;
	String name;
	StuDept s;

	public Student() {
	}

	public Student(int id, int rollno, String name, StuDept s) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.s = s;
	}

	public void display() {
		System.out.println(id + " " + name + " " + rollno);
	}

	public String toString() {
		return id + " " + name + " " + rollno+" "+s;
	}

}
