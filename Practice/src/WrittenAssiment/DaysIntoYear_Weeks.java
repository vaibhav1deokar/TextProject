package WrittenAssiment;

import java.util.Scanner;

public class DaysIntoYear_Weeks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of days");
		double d, y, w;
		d = sc.nextDouble();
		y = d / 365;
		w = (d % 365) / 7;
		d = d - (y * 365) + (w * 7);
		System.out.println(" year = " + y);
		System.out.println(" week = " + w);
		System.out.println(" days = " + d);
		sc.close();
	}

}
