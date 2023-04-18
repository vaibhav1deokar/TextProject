package interfaces;

public class SciCalculator implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition of two no. is = " + (a + b));
	}

	@Override
	public void substract(int a, int b) {
		System.out.println("Substraction of two no. is = " + (a - b));
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println("Multiplication of two no. is = " + (a * b));
	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division of two no. is = " + (a / b));
	}

	public void square(int a) {
		int b = a;
		int sq = a*b;
		System.out.println("square of no. is = "+sq);

	}

	public void power(int a) {
		int p = 3;
		int r = 1;
		for (int i=1; i<=p;i++) {
			r = a*r;

		}System.out.println("Power of no. is = "+r);
		}

	}


