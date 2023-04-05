package classandobject;

import java.util.Scanner;

public class AreaOfShapeMain {
	public static void main(String[] args) {

		AreaOfShapeMethod obj = new AreaOfShapeMethod();

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of Square");
		System.out.println("2.Area of Triangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Rectangle");
		System.out.println("Select the Option");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			obj.areaSquare();
			break;
		case 2:
			obj.areaTriangle();
			break;
		case 3:
			obj.areaCircle();
			break;
		case 4:
			obj.areaRectangle();
			break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();

	}
}