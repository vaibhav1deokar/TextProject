package inheritance;

public class Address {

	String city, state, country;

	Address(String city, String state, String country) {
		
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String toStirng() {
		return city + " " + state + " " + country;
	}
}
