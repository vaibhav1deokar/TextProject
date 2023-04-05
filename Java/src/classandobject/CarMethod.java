package classandobject;

public class CarMethod {
	
	int id, launchyear;
	String name, company;
	double price;

	void carData(int id,String name,String company,int launchyear,double price) {
		
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.launchyear = launchyear;
		this.price = price;

	}

	void display() {

		System.out.println(id+" " + name+" " + company+" " + price+" " + launchyear);
	}

}
