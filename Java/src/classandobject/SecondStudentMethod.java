package classandobject;

public class SecondStudentMethod {
	
	int id;
	String name,email, std;
	double marks;

	void setingData(int id,String name,String email,String std,double marks) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.std = std;
		this.marks = marks;
		
		display();

	}

	void display() {

		System.out.println(id+" " + name+" " + email+" " + std+" " + marks);
	}

}
