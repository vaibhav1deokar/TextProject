package writtentest2;

public class StudentMain {

	public static void main(String[] args) {

		StudentMethod obj = new StudentMethod();
		System.out.println("Enter the marks of 4 subjects");

		obj.studentData();
		System.out.println();
		obj.display();
	}

}
