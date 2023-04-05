package constructor;

public class FacultyMethod {

	int id, salary;
	String name, subject, collage;

	FacultyMethod() { // he manualy ghetal.
		id = 123;
		name = "vaibhav";
		subject = "Marathi";
		collage = "Anuradha";
		salary = 50000;

	}

	FacultyMethod(int id, String name, String subject, String collage, int salary) {
		this.id = id; // he user kadun ghetal.
		this.name = name;
		this.subject = subject;
		this.collage = collage;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + subject + " " + collage + " " + salary;
	}

}
