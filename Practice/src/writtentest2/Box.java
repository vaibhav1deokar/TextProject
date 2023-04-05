package writtentest2;

import java.util.Scanner;

public class Box {

	void boxMethod() {

		Scanner sc = new Scanner(System.in);

		float l = sc.nextFloat();
		float w = sc.nextFloat();
		float h = sc.nextFloat();

		float volume = l * w * h;

		System.out.println("The volume of box is = " + volume);

		sc.close();
	}

}
