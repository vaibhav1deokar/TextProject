package classandobject;

public class StudentMethod {
	
	int id;
	String name,email, std;
	double marks;

	void setingData(int i,String n,String e,String s,double m) {
		
		id = i;
		name = n;
		email = e;
		std = s;
		marks = m;

	}

	void display() {

		System.out.println(id+" " + name+" " + email+" " + std+" " + marks);
	}

}
