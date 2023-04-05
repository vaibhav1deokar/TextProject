package decisionstatement;

import java.util.Scanner;

public class AvarageMarksGrade {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	float a,b,c,d,e;
	
	System.out.println("Enter marks of sub");
	
	a = sc.nextFloat();
	b = sc.nextFloat();
	c = sc.nextFloat();
	d = sc.nextFloat();
	e = sc.nextFloat();
	
	float avg = (a+b+c+d+e)/5;
	
	System.out.println("Avarage of marks is "+avg+"%");
	
	if(avg>70 && avg<=100)
		System.out.println("pass with distintion");
	
	else if(avg>50 && avg<=69)
		System.out.println("pass with first class");
	
	else if(avg>=35 && avg<=49)
		System.out.println("pass with second class");
	
	else
	System.out.println("fail");
	
	sc.close();
	
	}

}
