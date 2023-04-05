package Written3;

public class Student {
	
	int roll;
	String name,deperment;
	
	void dataOfStudent(int roll, String name,String deperment) {
		this.roll=roll;
		this.name=name;
		this.deperment=deperment;
	}
	void display() {
		System.out.println(roll+" "+name+" "+deperment);
	}

}
