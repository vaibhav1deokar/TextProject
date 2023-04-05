package encapsulation;

public class EmployeeMain {
	public static void main(String[] args) {
	
	EmployeeMethod e1 = new EmployeeMethod();
//	System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary());
	
	e1.setId(123);
	e1.setName("ramesh");
	e1.setDept("mech.");
	e1.setSalary(60000);
	
	System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary());
	
	e1.setSalary(50000);
	
	System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary());

	}
}
