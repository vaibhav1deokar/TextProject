package arrayobject;

public class Student {

	int id;
	String name, dept,contact;
	double mark;

	Student(int id, String name, String dept, double mark,String contact) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.mark = mark;
		this.contact=contact;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + mark+" "+contact;
	}

}
