package abtraction;

public class SwiftCarMain {

	public static void main(String[] args) {

		Swift s = new Swift();
		s.setPrice(600000);
		s.setColour("White");
		s.dashbord();
		s.engine();
		s.seatNo();
		s.buildQuality();
		s.airBags();
		s.display();
		
		System.out.println("========*********===========");

		Polo p = new Polo();
		p.setPrice(900000);
		p.setColour("White");
		p.dashbord();
		p.engine();
		p.seatNo();
		p.buildQuality();
		p.airBags();
		p.display();

	}

}
