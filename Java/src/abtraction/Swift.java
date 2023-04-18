package abtraction;

public class Swift extends Car {
	
	Swift(){
		super(70000,"White");
		System.out.println("Swift Constructor");
	}

	@Override
	void dashbord() {
		System.out.println("swift has own music system, AC");
	}

	@Override
	void seatNo() {
		System.out.println("Swift car is 5 seater");
	}

	@Override
	void engine() {
		System.out.println("Swift has 1200cc engine");
	}

	void airBags() {
		System.out.println("Swift car has two airbags");
	}

	void buildQuality() {
		System.out.println("Swift car has ZERO safety reating");
	}
	
	void display() {
		System.out.println(price+" "+colour);
	}

}
