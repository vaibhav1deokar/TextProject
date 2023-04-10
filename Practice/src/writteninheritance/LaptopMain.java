package writteninheritance;

public class LaptopMain {

	public static void main(String[] args) {

		Laptop l = new Laptop();
		l.setNoofusbport(2);
		l.setProcessorspeed(5);

		System.out.println(l.getNoofusbport() + " " + l.getProcessorspeed());
	}

}
