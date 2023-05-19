package arrayobject;

import java.util.Scanner;

public class CarMain {

	Car ca[] = new Car[8];
//	Scanner sc = new Scanner(System.in);

	void addDetail() {

		ca[0] = new Car(123, 600000, "nexon", "tata");
		ca[1] = new Car(456, 700000, "xuv300", "mahindra");
		ca[2] = new Car(789, 800000, "swift", "suzuki");
		ca[3] = new Car(321, 900000, "venue", "hondai");
		ca[4] = new Car(654, 500000, "vertus", "volswagen");
	}

	void searchData() {
		for (Car i : ca) {
			if (i.price > 700000) {
				System.out.println(i);
			}
		}
	}

	void displayData() {

	}

	public static void main(String[] args) {

		CarMain c = new CarMain();
		c.searchData();
		c.displayData();
	}
}
