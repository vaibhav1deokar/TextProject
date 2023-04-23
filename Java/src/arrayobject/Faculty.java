package arrayobject;

public class Faculty {

	int id, salary;
	String name, email, dept;

	Faculty(int id, int salary, String name, String email, String dept) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + email + " " + salary;
	}

}
