package inheritance;

public class AddressPersonMain {
	public static void main(String[] args) {

		Address a1 = new Address("mehkar", "Maharastra", "india");
		Address a2 = new Address("chikhali", "Maharastra", "india");

		Person p1 = new Person(123, "sukesh", "9865325498", a1);
		Person p2 = new Person(321, "rajesh", "8456985452", a2);

		System.out.println(p1.name+" "+p1.contact+" "+p1.add.city);
		System.out.println(p2);
	}

}
