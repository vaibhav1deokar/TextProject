package forlooping;

public class PrimeNumber {
	public static void main(String[] args) {
		int b = 100;

		for (int a = 1; a <= b; a++) {
			int temp = 0;
			for (int i = 1; i <= a; i++) {

				if (a % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 2) {
				System.out.println(a);
			}

		}
	}

}
