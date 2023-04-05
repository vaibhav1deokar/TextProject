package BasicJava;

public class Program {

	public static void main(String[] args) {

		int a = 2364;
		int num = 0;
		int mod = 0;
		int sum = 0;

		while (a > 0) {

			mod = a % 10;

			if (mod % 2 == 0) {

				sum = sum + mod;

			}
			a = a / 10;

		}
		System.out.println(sum);

	}
}
