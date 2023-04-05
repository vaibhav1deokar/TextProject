package classandobject;

import java.util.Scanner;

public class CarMain {
	
	public static void main(String[] args) {

		CarMethod e1 = new CarMethod();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, Name, company, price, launchyear");
		int id = sc.nextInt();
		String name = sc.next();
		String company = sc.next();
		double price = sc.nextDouble();
		int launchyear = sc.hashCode();
		
		e1.carData(id, name, company, launchyear, price);;
		
		System.out.println("----------------------");
		
		CarMethod e2 = new CarMethod();
		
		System.out.println("Enter id, Name, company, price, launchyear");
		id = sc.nextInt();
		name = sc.next();
		company = sc.next();
		price = sc.nextDouble();
		launchyear = sc.nextInt();
		
		e2.carData(id, name, company, launchyear, price);
		
		System.out.println("-----------------------");
		
		e1.display();
		e2.display();
		
		sc.close();
	}


}
