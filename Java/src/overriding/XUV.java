package overriding;

public class XUV extends CarBasic{
	
	void dashbord() {
		super.dashbord();
		System.out.println("xuv having : touch screen, music system, back camera");
	}
	void seatNumber() {
		System.out.println("xuv is 7 seater");
		super.seatNumber();
	}

}
