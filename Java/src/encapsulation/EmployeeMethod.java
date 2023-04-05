package encapsulation;

public class EmployeeMethod {
	
	private int id,salary;
	private String name,dept;
	
	
//	EmployeeMethod(int id,int salary,String name,String dept){  //by using constructor.
//		this.id = id;
//		this.name = name;
//		this.dept = dept;
//		this.salary = salary;
//	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId () {
		return id;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
//	public static void main(String[] args) {
//		EmployeeMethod e1 = new EmployeeMethod();
//		System.out.println(e1.id);
//	}

}
