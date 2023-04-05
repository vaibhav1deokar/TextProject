package AssimentOnSwitch;

import java.util.Scanner;

public class DisplayDaysOfWeek {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the day no.");

		int a;
		a = 1;
		a = input.nextInt();

		switch (a) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		case 8:
			if(a>=7)
			System.out.println("error, day does not exist");
		}
		input.close();

	}

}
