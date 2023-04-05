package decisionstatement;

import java.util.Scanner;

public class StateAndCapital {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state name");
		String state = sc.nextLine();

		state = state.toLowerCase();

		switch (state) {
		case "maharastra":
			System.out.println("Mumbai");
			break;
		case "karnataka":
			System.out.println("Banglore");
			break;
		case "gujrat":
			System.out.println("Gandhi Nagar");
			break;
		case "uttar pradesh":
			System.out.println("Laknow");
			break;
		case "goa":
			System.out.println("Panji");
			break;
		default:
			System.out.println("please enter valid state");

			sc.close();
		}
	}

}
