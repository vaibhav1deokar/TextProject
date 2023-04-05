package forlooping;

public class FibonicciSeries {
	public static void main(String[] args) {

		int a = 0, b = 1;

//		System.out.print(a + " " + b + " ");

//		for (int i = 2; i < 9; i++) {
//			int add = a + b;
//			System.out.print(add + " ");
//			a = b;
//			b = add;
//		}

		for (int i = 2; i <= 9; i++) {
			int add = a + b;
			System.out.print(a + " ");
			a = b;
			b = add;
		}
	}
}
