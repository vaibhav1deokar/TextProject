package writteninheritance;

public class PersonIdMain {
	public static void main(String[] args) {

		IdProof d = new IdProof();
		d.setName("Ravi");
		d.setNumber("123");
		d.setValidity("2035");

		Person p = new Person();
		p.setName("Rahul");
		p.setId(321);
		p.setContact("9865325421");
		p.setAddress("pune");
		p.setIdp(d);

		System.out.println(p.getId() + " " + p.getContact() + " " + p.getAddress() + " " + p.getIdp().getName() + " "
				+ p.getIdp().getNumber() + " " + p.getIdp().getValidity());

		Person p1 = new Person();
		p1.setName("Pritam");
		p1.setId(456);
		p1.setContact("8765325421");
		p1.setAddress("Amravti");
		p1.setIdp(d);

		System.out.println(p1.getId() + " " + p1.getContact() + " " + p1.getAddress() + " " + p1.getIdp().getName()
				+ " " + p1.getIdp().getNumber() + " " + p1.getIdp().getValidity());

		Person p2 = new Person();
		p2.setName("Kapil");
		p2.setId(789);
		p2.setContact("7865325421");
		p2.setAddress("Lonar");
		p2.setIdp(d);

		System.out.println(p2.getId() + " " + p2.getContact() + " " + p2.getAddress() + " " + p2.getIdp().getName()
				+ " " + p2.getIdp().getNumber() + " " + p2.getIdp().getValidity());

	}

}
