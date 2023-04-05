package BasicJava;

public class SquareRoot {
	public static void main(String[] args) {

		double a = 9, sqrt = 1;

		for (int i = 1; i <= a; i++) {

			if (a % i == 0) {

				if (i * i == a) {

					sqrt = i;
				}
			}
		}
		System.out.println("Square root is = " + sqrt);

	}

}
