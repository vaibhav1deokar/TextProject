package inheritance;

public class DateTimeMain {
	public static void main(String[] args) {
		
	MyDay d1 = new MyDay();
	
	d1.setDate(12, 10, 2023);
	d1.setTime(10, 30, 20);
	d1.setDay("Monday");
	d1.display();
	
	}
}
