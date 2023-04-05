package inheritance;

public class EmployeeCompanyMain {

	public static void main(String[] args) {  //Containment   (has a)  relationship...

		Employee em1 = new Employee();

		em1.setId(321);
		em1.setName("rahul");
		em1.setDept("HR");
		em1.setSalary(50000);

		Company obj = new Company();

		obj.setId(123);
		obj.setName("rahul");
		obj.setAddress("pune");
		obj.setEmp(em1);

		System.out.println(obj.getName() + " " + obj.getId() + " " + obj.getAddress() + " " + obj.getEmp().getDept()
				+ " " + obj.getEmp().getSalary());
	}

}
