package Another;

public class BookMain {
	
	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.setId(123);
		b.setName("English");
		b.setPrice(250.5);
		
		System.out.println(b.getId()+" "+b.getName()+" "+b.getPrice());
	}

}
