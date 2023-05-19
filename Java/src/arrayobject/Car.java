package arrayobject;

public class Car {

	int id, price;
	String name, company;

	Car(int id, int price, String name, String company) {

		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public String toString() {
		return id + " " + name + " " + company + " " + price;
	}

}
