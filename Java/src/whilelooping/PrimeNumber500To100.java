package whilelooping;

public class PrimeNumber500To100 {
	public static void main(String[] args) {

		int b = 200;
		
		for (int a = 500; a >= b; a--) {
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
