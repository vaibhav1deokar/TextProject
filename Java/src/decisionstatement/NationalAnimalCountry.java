package decisionstatement;

import java.util.Scanner;

public class NationalAnimalCountry {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Country name");
		
		String country = input.nextLine();

		country = country.toLowerCase();

		switch (country) {
		case "india":
			System.out.println("Tiger");
			break;
		case "bangladesh":
			System.out.println("Bengal tiger");
			break;
		case "brazil":
			System.out.println("Rufous-bellied thrush");
			break;
		case "canada":
			System.out.println("North American beaver");
			break;
		case "thailand":
			System.out.println("Asian elephant");
			break;
		default:
			System.out.println("please enter valid country");

		}
		input.close();
	}

}
