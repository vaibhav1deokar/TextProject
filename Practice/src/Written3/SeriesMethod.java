package Written3;

import java.util.Scanner;

public class SeriesMethod {

	void series(double n) {

		double sum = 0;

		for (int i = 1; i <= n; i++) {
			double f = 1;
			for (int j = 1; j <= i; j++) {
				f = f * j;
			}
			sum = sum + (1 / f);
		}
		System.out.println("Sum = " + sum);
	}

	void series1(double a, double n) {
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SeriesMethod obj = new SeriesMethod();
		System.out.println("Enter no.");
		obj.series(sc.nextDouble());
		
		sc.close();
	}

}
