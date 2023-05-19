package arrayobject;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Payment p = new Payment();
		p.setId(123);
		p.setP_mode("Gpay");
		p.setBalance(10000.00f);

		System.out.println("Enter the Withdraw Amount");
		int amount = sc.nextInt();
		
		float b =p.getBalance()-amount;
		
		p.setBalance(b);
		
//	Payment paymentsend() {
//		Payment p = new Payment();
//		return p;
//	}
	}
	
}