package decisionstatement;

public class MultipleOfThree {
	public static void main(String[] args) {

		int a = 27;

		if (a > 0) {
			if (a % 3 == 0) {
				System.out.println("mult. of Three");
			} else {
				System.out.println("Not mult. of Three");
			}
		} else {
			System.out.println("Please enter positive no.");
		}
	}

}
