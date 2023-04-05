package polymoephism;

public class AreaOfShape {

	void area(int a) {
		System.out.println("Area of Square = " + (a * a));
	}

	void area(int h, int b) {
		System.out.println("Area of Triangle = " + (h * b / 2));
	}

	void area(double r) {
		System.out.println("Area of Circle = " + (3.14 * r * r));
	}

	void area(float w, int l) {
		System.out.println("Area of Rectangle = " + (w * l));
	}

	public static void main(String[] args) {

		AreaOfShape a1 = new AreaOfShape();

		a1.area(5);
		a1.area(4, 9);
		a1.area(2.5);
		a1.area(2.5f, 6);
	}

}
