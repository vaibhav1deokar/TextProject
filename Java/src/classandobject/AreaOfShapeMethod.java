package classandobject;

import java.util.Scanner;

public class AreaOfShapeMethod {
	
	Scanner sc = new Scanner(System.in);

	void areaSquare() {
		System.out.println("Enter the length of Square");
		float l = sc.nextFloat();
		float a = l*l;
		System.out.println("Area of Square is = "+a);
	}
	
	void areaTriangle() {
		System.out.println("Enter the hight and bridth");
		float h = sc.nextFloat();
		float b = sc.nextFloat();
		float a = (h*b)/2;
		System.out.println("Area of Triangle is = "+a);
	}
	
	void areaCircle() {
		System.out.println("Enter the radius");
		float r = sc.nextFloat();
		float a = (3.14f)*r*r;
		System.out.println("Area of Circle is = "+a);
	}
	
	void areaRectangle() {
		System.out.println("Enter the width and length");
		float w = sc.nextFloat();
		float l = sc.nextFloat();
		float a = w*l;
		System.out.println("Area of Rectangle is = "+a);
	}

}
