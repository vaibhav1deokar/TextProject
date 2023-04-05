package WrittenAssiment;

import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle");

		double l, b, p;
		l = sc.nextDouble();
		System.out.println("Enter breadth of rectangle");
		b = sc.nextDouble();

		p = 2 * (l + b);

		System.out.println("Perimeter of rectangle is = " + p);
		sc.close();
	}

}
