package thisis;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(123);
		s.setName("Rahul");
		
		System.out.println(s.getId()+" "+s.getName());
		
		Student s1 = new Student();
		s1.setId(321);
		s1.setName("Rakul");
		
		System.out.println(s1.getId()+" "+s1.name);
	}

}
