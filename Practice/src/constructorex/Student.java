package constructorex;

public class Student {
	
	String name, dept, contact;
	int rollno, age, weight;
	
	void school(String name,String dept, String contact,int age, int rollno, int weight) {
		
		this.name = name;
		this.dept=dept;
		this.contact=contact;
		this.age=age;
		this.rollno=rollno;
		this.weight=weight;
		
		System.out.println("school is the method of student class");
		System.out.println(name+" "+dept+" "+contact+" "+rollno+ " "+age+" "+weight);
	}
	
	Student(String name,String dept, String contact,int age, int rollno, int weight){
		
		this.name = name;
		this.dept=dept;
		this.contact=contact;
		this.age=age;
		this.rollno=rollno;
		this.weight=weight;
		
		System.out.println("constructor of Student class");
		System.out.println(name+" "+dept+" "+contact+" "+rollno+ " "+age+" "+weight);

	}

	public static void main(String[] args) {
		Student s = new Student("rahul", "cs", "8754216532", 24, 2510, 50);
		s.school("viky", "mech", "9865325421", 25, 1210, 55);
		
		
	}
}
