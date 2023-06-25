package dowhile;

public class EvenNumber {
	public static void main(String[] args) {

		int s = 1;
		do {
			if (s % 2 == 0) {
				System.out.println(s);
				s++;
			}
		} while (s <= 10);
		System.out.println("Done");
	}
}
