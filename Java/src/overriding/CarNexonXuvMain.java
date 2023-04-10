package overriding;

public class CarNexonXuvMain {
	
	public static void main(String[] args) {
		
		Nexon n1 = new Nexon();
		n1.dashbord();
		n1.SeatNumber();
		
		System.out.println();
		
		XUV x1 = new XUV();
		x1.dashbord();
		x1.seatNumber();
		
		System.out.println();
		
		CarBasic c1 = new CarBasic();
		c1.dashbord();
		c1.gearsOfCar();
		c1.seatNumber();
	}

}
