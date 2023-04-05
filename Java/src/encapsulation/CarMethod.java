package encapsulation;

public class CarMethod {
	
	private int id,price,launchyear;
	private String name,company;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId () {
		return id;
	}
	
	public void setLaunchyear(int launchyear) {
		this.launchyear = launchyear;
	}
	
	public int getLaunchyear () {
		return launchyear;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}

}
