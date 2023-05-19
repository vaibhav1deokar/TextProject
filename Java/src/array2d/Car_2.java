package array2d;

public class Car_2 {

	int id, price;
	String name, company;

	Car_2(int id, int price, String name, String company) {

		this.id = id;
		this.price = price;
		this.name = name;
		this.company = company;
	}

	public String toString() {
		return id + " " + name + " " + company + " " + price;
	}

}
