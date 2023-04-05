package constructor;

import java.util.Scanner;

public class CarMain {
	
	public static void main(String[] args) {

		CarMethod c1 = new CarMethod();
		System.out.println(c1);
		
		CarMethod c2 = new CarMethod(1968,"mustang","ford",5000000);
		System.out.println(c2);		
		
		Scanner sc = new Scanner (System.in);
		CarMethod c3 = new CarMethod();
		
		System.out.println("Enter the detail of car");
		
		int id = sc.nextInt();
		String name = sc.next();
		String company = sc.next();
		int price = sc.nextInt();
		
		CarMethod c4 = new CarMethod(id,name,company,price);
		
		System.out.println(c3);
		System.out.println(c4);
		
		sc.close();
	}

}
