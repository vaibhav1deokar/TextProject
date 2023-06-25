package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeMain {

	void data(LinkedList<Employee> ltr) {
		ltr.add(new Employee(101, "raj", "mechanical"));
		ltr.add(new Employee(103, "Rahul", "Cs"));
		ltr.add(new Employee(111, "Priya", "Civil"));
		ltr.add(new Employee(133, "Riya", "Extc"));
		ltr.add(new Employee(154, "Rakul", "Telecommunication"));
		ltr.add(new Employee(156, "Rina", "mechanical"));
		ltr.add(new Employee(456, "Tina", "Extc"));
		ltr.add(new Employee(145, "Supriya", "Civil"));
		ltr.add(new Employee(10, "Vaibhav", "mechanical"));
		ltr.add(new Employee(102, "Nilesh", "Extc"));

	}

	void display(LinkedList<Employee> ltr) {
		String s = " ";
		for (Employee emp : ltr) {
			if (emp.id == 10) {
				s = emp.dept;
//				break;

			}
		}
		ListIterator<Employee> iterator = ltr.listIterator();
		while (iterator.hasNext()) {
			Employee emp = iterator.next();
			if (emp.dept.equals(s)) {
				iterator.remove();
			}
		}

		System.out.println("List after deletion: " + ltr);
	}

	public static void main(String[] args) {
		LinkedList<Employee> ltr = new LinkedList<>();
		EmployeeMain obj = new EmployeeMain();
		obj.data(ltr);
		obj.display(ltr);

	}

}
