package assimentonwhile;

import java.util.Scanner;

public class CalculateProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no.");
		long num, pro=1;
		num = sc.nextInt();
		
		while(num>0) {
			long dig = num%10;
			pro = pro*dig;
			num = num/10;
		}
		System.out.println("Product of number is = "+pro);	
	}
}
