package writteninheritance;

public class Person {

	int id;
	String name, contact, address;
	IdProof idp;

	public IdProof getIdp() {
		return idp;
	}

	public void setIdp(IdProof idp) {
		this.idp = idp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
