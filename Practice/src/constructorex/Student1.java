package constructorex;

public class Student1 {
	
	String name;
	int rollno;
	
	Student1(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
		
	}
	void display() {
		System.out.println(name+" "+rollno);
	}
	public String toString () {
		return name+" "+rollno;
		
	}
	
	public static void main(String[] args) {
		Student1 s1 = new Student1("viky", 1760);
		s1.display();
		System.out.println(s1);
	}

}
