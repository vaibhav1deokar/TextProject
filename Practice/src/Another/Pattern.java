package Another;

public class Pattern {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 0; i <= a; i++) {
//			System.out.println();
			for (int k = 1; k <=a-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
	}

}
