package staticclass;

public class StudentMain {
	
	
	static int a; // static block.  ye hum use nahi karte , q ki iska koi fayda hi nahi, 
	int b;          //	main se pahile kya exicute karoge.
	
	
	static {
		a = 300;
		System.out.println(a);
//		System.out.println(b);
	}

	
	
	public static void main(String[] args) {    //exicution main method se hi start hota hai.

		System.out.println(Student.collagename); // variable call.

		Student s1 = new Student(123, 95, "Rahul", "Mech");
		Student s2 = new Student(321, 85, "Raju", "Civil");

		Student.collageName(); // Method call.

		System.out.println(s1);
		System.out.println(s2);
		
		

	}
}
