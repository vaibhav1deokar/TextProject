package Written3;

public class Deperment {
	
	int id;
	String name;
	
	void dataOfDeperment(int id, String name) {
		this.id=id;
		this.name=name;
	}
	void display(){
		System.out.println(id+" "+name);
	}

}
