package hyrachicalInheritance;

public class Employee extends Person {

	int eid, salary;
	String dept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	void pfCalculation() {
		float pf = salary * 0.1f;
		System.out.println("pf is = " + pf);
	}

	void display() {
		System.out.println(eid + " " + name + " " + contact + " " + salary + " " + address);
	}

}
