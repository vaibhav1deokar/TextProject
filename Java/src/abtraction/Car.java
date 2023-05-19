package abtraction;

public abstract class Car {
	
	int price;
	String colour;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	Car(int price, String colour){
		this.colour=colour;
		this.price=price;
//		System.out.println(price+" "+colour);
	}

	abstract void dashbord();
	
	abstract void engine();
	
	abstract void seatNo();
	
	void wheelNo() {
		System.out.println("A car has 4 wheeler");
	}
	
	void mirror() {
		System.out.println("Every car has 3 mirror");
	}
}
