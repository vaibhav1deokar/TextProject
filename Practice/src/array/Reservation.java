package array;

public class Reservation {
	String person_name;
	int age;
	double ticket_price;

	public Reservation(String person_name, int age, double ticket_price) {
		this.person_name = person_name;
		this.age = age;
		this.ticket_price = ticket_price;
	}

	public double calculatePrice() {
		double totalPrice;
		if (age > 65) {
			totalPrice = ticket_price - ticket_price * 0.1;
		} else if (age > 40) {
			totalPrice = ticket_price - ticket_price * 0.05;
		} else if (age > 18) {
			totalPrice = ticket_price - ticket_price * 0.02;
		} else {
			totalPrice = ticket_price;
		}
		return totalPrice;
	}

	public String toString() {
		return person_name + " " + age + " " + ticket_price;
	}

}
