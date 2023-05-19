package arrayobject;

import java.util.Arrays;
import java.util.Scanner;

class Car1 {

	int id;
	String name, brand;

	public Car1() {

	}

	public Car1(int id, String name, String brand) {

		this.id = id;
		this.name = name;
		this.brand = brand;

	}

	public void display() {
		System.out.println(id + " " + name + " " + brand);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Car1 carArr[] = new Car1[4];

		Car1 c1 = new Car1(123, "Nexon", "TATA");
//		System.out.println(c1);
		carArr[0] = c1;
		carArr[1] = new Car1(321, "Swift", "Maruti");
		carArr[3] = new Car1();
		carArr[3].id = 5;
		carArr[3].name = "Vertus";
		carArr[3].brand = "Audi";

		for (int i = 0; i < carArr.length; i++) {
//			Scanner sc = new Scanner(System.in);

			carArr[i] = new Car1();
			System.out.println("Enter id");
			carArr[i].id = sc.nextInt();
			System.out.println("Enter name");
			carArr[i].name = sc.next();
			System.out.println("Enter brand");
			carArr[i].brand = sc.next();

		}

		System.out.println(Arrays.toString(carArr));
	}

	public String toString() {
		return id + " " + name + " " + brand;
	}

}

class CarMain2 {

}
