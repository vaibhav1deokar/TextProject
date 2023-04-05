package decisionstatement;

import java.util.Scanner;

public class AvarageMarks {
	public static void main(String[] args) {
		
		int a, b, c, d, e, Avarage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Five Number");
		
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		e= sc.nextInt();
		
		Avarage = (a+b+c+d+e)/5;
		
		System.out.println("Avarage Marks = "+Avarage);
		sc.close();
		
	}

}
