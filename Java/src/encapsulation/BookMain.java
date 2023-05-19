package encapsulation;

public class BookMain {

	public static void main(String[] args) {
		String name = "java";
		
		Book b = new Book();
		b.setBookid(123);
		b.setBookname("java");
		b.setPrice(250);

		if (name.equalsIgnoreCase("java")) {
			int a = b.getPrice();
			int discount  = (int) (a-a*0.10);
			b.setPrice(discount);
		}
		System.out.println(b.getBookid() + " " + b.getBookname() + " " + b.getPrice());
	}
}
