package writtenabstraction;

public class Mastani implements IceCream,Juice{
	
	@Override
	public void eat() {
		System.out.println("icecream is eat");
	}
	
	@Override
	public void drink() {
		System.out.println("juice is drink");
	}

}
