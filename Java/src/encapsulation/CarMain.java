package encapsulation;

public class CarMain {

	public static void main(String[] args) {

		CarMethod c1 = new CarMethod();

		c1.setId(123);
		c1.setName("Nexon");
		c1.setCompany("TATA");
		c1.setPrice(6000000);
		c1.setLaunchyear(2018);

		System.out.println(c1.getId() + " " + c1.getName() + " " + c1.getCompany() + " " + c1.getPrice() + " "
				+ c1.getLaunchyear());

		c1.setPrice(5000000);

		System.out.println(c1.getId() + " " + c1.getName() + " " + c1.getCompany() + " " + c1.getPrice() + " "
				+ c1.getLaunchyear());

	}

}
