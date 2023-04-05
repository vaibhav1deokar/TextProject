package classandobject;

public class Employee1Method {
	
	int id;
	String name, dept, contact;
	double salary;

	void setingData(int i,String n,String d,String c,double s) {
		
		id = i;
		name = n;
		dept = d;
		contact = c;
		salary = s;

	}

	void display() {

		System.out.println(id+" " + name+" " + dept+" " + contact+" " + salary);
	}

}
