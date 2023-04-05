package hyrachicalInheritance;

public class EmpStuPerMain {
	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setEid(123);
		e1.setName("vikram");
		e1.setContact("9865324512");
		e1.setSalary(50000);
		e1.setDept("Devloper");
		e1.setAddress("pune");
		e1.display();
		e1.pfCalculation();

		System.out.println();

		Student s1 = new Student();
		s1.setSid(321);
		s1.setName("rakesh");
		s1.setContact("8754216598");
		s1.setAddress("Mumbai");
		s1.setPercent(50.0f);
		s1.display();
		s1.grade();
	}

}
