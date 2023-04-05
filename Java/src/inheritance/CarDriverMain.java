package inheritance;

public class CarDriverMain {

	public static void main(String[] args) {

		Driver d1 = new Driver();
		d1.setId(123);
		d1.setName("rakesh");
		d1.setContact("9865325421");

		Driver d2 = new Driver();
		d2.setId(456);
		d2.setName("mukesh");
		d2.setContact("9584659895");

		Car c1 = new Car();
		c1.setId(321);
		c1.setName("mohan");
		c1.setNumber(65655);
		c1.setDr(d1);

		Car c2 = new Car();
		c2.setId(789);
		c2.setName("rohan");
		c2.setNumber(4561);
		c2.setDr(d2);

		System.out.println(
				c1.getId() + " " + c1.getNumber() + " " + c1.getDr().getName() + " " + c1.getDr().getContact());

		System.out.println(
				c2.getId() + " " + c2.getNumber() + " " + c2.getDr().getName() + " " + c2.getDr().getContact());

	}

}
