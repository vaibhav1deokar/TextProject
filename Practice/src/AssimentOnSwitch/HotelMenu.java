package AssimentOnSwitch;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hotel Menu\n1.Maharastrian Thali\n2.Rajastan Thali\n3.Punjabi Thali\n4.Bengoli Thali");
		System.out.println("Order dish");

		String dish = sc.nextLine();
		dish = dish.toLowerCase();

		int m, r, p, b, que, mult;
		System.out.println("Apply quantity");
		que = sc.nextInt();

		switch (dish) {
		case "maharastrian thali":
			m = 150;
			mult = m * que;
			System.out.println("Total bill amount is " + mult + "rs.");
			break;
		case "rajastan thali":
			r = 160;
			mult = r * que;
			System.out.println("Total bill amount is " + mult + "rs.");
			break;
		case "punjabi thali":
			p = 170;
			mult = p * que;
			System.out.println("Total bill amount is " + mult + "rs.");
			break;
		case "bengoli thali":
			b = 180;
			mult = b * que;
			System.out.println("Total bill amount is " + mult + "rs.");
			break;
		default:
			System.out.println("Order valid Dish");
		}
		sc.close();

	}

}
