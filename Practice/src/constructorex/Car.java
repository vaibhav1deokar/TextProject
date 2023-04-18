package constructorex;

public class Car {

	int carno, chesisno;
	static String name, brand;

	public Car() {

	}
	
//	void Car() {
//		String name = tata;
//	}
	
	void CarDetail(String name,String brand) {
//		String name;
//		String brand;
		System.out.println(name+" "+brand);
	}

	protected Car(int carno, int chesisno, String name, String brand) {

		this.carno = carno;
		this.chesisno = chesisno;
//		this.name = name;
//		this.brand = brand;

		System.out.println(carno + " " + chesisno + " " + name + " " + brand);
	}
	
	Car(String name,String brand, int carno){
		System.out.println("hello");
		name=name;
		brand = brand;
		carno=carno;
	}

	public static void main(String[] args) {

		Car c = new Car(123,326598,"q7","audi");
		Car c2 = new Car("tata","altroz",3265);
		System.out.println(c);
		c.CarDetail("nexon", "TATA");
		System.out.println(c2);

	}
}