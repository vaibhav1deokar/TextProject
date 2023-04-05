package AssimentOnSwitch;

import java.util.Scanner;

public class TotalNoOfDays {
	public static void main(String[] args) {

		Scanner sp = new Scanner(System.in);

		System.out.println("Enter the no. of Month ");
		int num;
		num = sp.nextInt();

		switch (num) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			System.out.println("days is 31");
			break;
		}
		case 2:
		{
			System.out.println("days is 28/29");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			System.out.println("days is 30");
			break;
		}
		
		
		}
		sp.close();
	}

}
