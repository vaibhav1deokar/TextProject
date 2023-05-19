package arrayOfObjects;

import java.util.Arrays;
import java.util.Scanner;

public class CarMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Car carArr[] = new Car[5]; // car array object created.

		Car c1 = new Car(1, "nexon", "TATA");
		carArr[0] = c1; // 1 way.

		carArr[1] = new Car(2, "swift", "Maruti");

		carArr[2] = new Car();
		carArr[2].id = 3;
		carArr[2].name = "virtus";
		carArr[2].brand = "Volswagen";

		System.out.println(Arrays.toString(carArr));

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < carArr.length; i++) {
			carArr[i] = new Car();
			System.out.println("Enter id");
			carArr[i].id = sc.nextInt();
			System.out.println("Enter name");
			carArr[i].name = sc.next();
			System.out.println("Enter brand");
			carArr[i].brand = sc.next();
		}
		System.out.println(Arrays.toString(carArr));
	}

	
}
