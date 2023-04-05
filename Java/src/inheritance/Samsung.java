package inheritance;

public class Samsung extends Mobile{
	
	int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void cameraResolution() {
		System.out.println("camera must have more than 12Mp");
	}
	
	void display() {
		System.out.println();
	}

}
