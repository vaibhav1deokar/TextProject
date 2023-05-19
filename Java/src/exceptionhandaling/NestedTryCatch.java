package exceptionhandaling;

import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a = 100,b=5;
		int arr[] = {1,2,3,4,5,6};
		String s = "india";
		
		try {
			try {
				try {
					System.out.println("charactor is : "+s.charAt(10));
				}
				catch(StringIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
//				System.out.println("enter b :");
//				int b =sc.nextInt();
				
				System.out.println("Division is :"+(a/b));
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
			System.out.println(arr[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
