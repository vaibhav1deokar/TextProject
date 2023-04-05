package classandobject;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeMethod e1 = new EmployeeMethod();
				
		e1.setData();

		System.out.println("----------------");
		
		EmployeeMethod e2 = new EmployeeMethod();
		
		e2.setData();

		System.out.println("----------------");
		
		EmployeeMethod e3 = new EmployeeMethod();
		
		e3.setData();

		System.out.println("----------------");
		
		e1.display();
		e2.display();
		e3.display();
		
	}
}
