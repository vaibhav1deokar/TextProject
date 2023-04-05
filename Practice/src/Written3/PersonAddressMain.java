package Written3;

public class PersonAddressMain {

	public static void main(String[] args) {

		Address a1 = new Address();
		a1.setCity("Mehkar");
		a1.setCountry("India");
		a1.setState("Maharastra");

		Person p1 = new Person();

		p1.setName("rahul");

		p1.setGender("Male");

		p1.setAge(25);
		p1.setAdd(a1);

		System.out.println("person name, gender, age, city, state, country");
		System.out.println(p1.getName() + " " + p1.getGender() + " " + p1.getAge() + " " + p1.getAdd().getcity() + " "
				+ p1.getAdd().getState() + " " + p1.getAdd().getCountry());

	}

}
