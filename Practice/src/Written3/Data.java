package Written3;

import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	Person p1 = new Person ();
	Address a1 = new Address();
	System.out.println("Enter details name, gender, age, city, state, country");
	
	p1.setName(sc.next());
	p1.setGender(sc.next());
	p1.setAge(sc.nextInt());
	a1.setCity(sc.next());
	a1.setState(sc.next());
	a1.setCountry(sc.next());
	
	System.out.println(p1.getName()+" "+p1.getGender()+" "+p1.getAge()+" "
	+a1.getcity()+" "+a1.getState()+" "+a1.getCountry());
	
	sc.close();
	}
}
