package arrayOfObjects;

public class Car {

	int id;
	String name;
	String brand;

	public Car() {}

	public Car(int id, String name, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}

	public void display() {
		System.out.println(id + " " + name + " " + brand);
	}

	public String toString() {
		return id + " " + name + " " + brand;
	}

}
