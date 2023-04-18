package writtenabstraction;

public class MainKid {

	public static void main(String[] args) {
		
		Kid k1=new BigKid();
		Kid k2= new Teenager();
		k1.readBooks();
		k2.readBooks();
	}
}
