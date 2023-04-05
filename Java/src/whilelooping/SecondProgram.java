package whilelooping;

import java.util.Scanner;

public class SecondProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the end number");
		int a = 1;
		int b = sc.nextInt();
		while(a<=b) {
			if(a%2!=0)
				System.out.println(+a+" this are odd number");
			a++;
		}
		System.out.println("done");
		sc.close();
	} 
}
	
	// Reverse it for even numbers.....


