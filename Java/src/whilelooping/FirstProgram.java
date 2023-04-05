package whilelooping;

import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the end number");
		int a = 1;
		int b = sc.nextInt();
		while(a<=b) {
			System.out.println(+a);
			a++;
		}
		sc.close();
	}

}
