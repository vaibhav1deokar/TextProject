package array;

public class ReservationMain {
	
	public static void main(String[] args) {
	
		Reservation obj = new Reservation("Ram", 70, 100);
		double totalPrice = obj.calculatePrice();
		System.out.println(obj);
		System.out.println("Price after Discount");
		System.out.println(totalPrice);

	}

}
