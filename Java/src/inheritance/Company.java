package inheritance;

public class Company {

	int id;
	String name, address;
	Employee emp;

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
