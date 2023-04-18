package abtraction;

public class Polo extends Car {
	
	Polo(){
		super(900000,"white");
		System.out.println("Polo constructor");
	}

	@Override
	void dashbord() {
		System.out.println("Polo has own music system, AC, Touch Screen");
	}

	@Override
	void seatNo() {
		System.out.println("Polo car is 5 seater");
	}

	@Override
	void engine() {
		System.out.println("Polo has 1000cc engine");
	}

	void airBags() {
		System.out.println("Polo car has two airbags");
	}

	void buildQuality() {
		System.out.println("Polo car has FIVE Star safety reating");
	}
	
	void display() {
		System.out.println(price+" "+colour);
	}
}
