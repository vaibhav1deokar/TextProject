package constructor;

public class CarMethod {
	
	int id, price;
	String name, company;
	
	CarMethod (){
		id = 123;
		name = "Nexon";
		company = "tata";
		price = 1500000;
	}
	
	CarMethod(int id, String name, String company, int price){
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	
	
	public String toString() {                     // hi method hash code sathi wapartat.
		return id+" "+name+" "+company+" "+price;
	}
	

}
