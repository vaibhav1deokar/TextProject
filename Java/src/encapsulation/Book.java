package encapsulation;

public class Book {
	
	private int bookid;
	private String bookname;
	private int price;
	
	public void setBookid (int bookid) {
		this.bookid=bookid;
	}
	
	public int getBookid () {
		return bookid;
	}
	
	public void setBookname (String bookname) {
		this.bookname=bookname;
	}
	
	public String getBookname () {
		return bookname;
	}
	
	public void setPrice (int price) {
		this.price=price;
	}
	
	public int getPrice () {
		return price;
	}

}
