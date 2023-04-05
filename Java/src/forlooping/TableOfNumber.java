package forlooping;

import java.util.Scanner;

public class TableOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int no=1;
		no = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(+i+"*"+no+"="+no*i);
		}
		sc.close();
	}

}
