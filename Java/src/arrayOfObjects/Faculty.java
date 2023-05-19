package arrayOfObjects;

public class Faculty {

	int id, salary;
	String name;
	FacDept f;

	public Faculty() {
	}

	public Faculty(int id, int salary, String name, FacDept f) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.f = f;
	}

	public String toString() {
		return id + " " + name + " " + salary + " " + f;
	}

}
