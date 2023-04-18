package arrays;

import java.util.Scanner;

public class ArrayOperation {
	
	void addArrayElement(int a[]) {
		int sum = 0;
		for(int i:a) {
			sum = sum+i;
		}
		System.out.println("Addition is = "+sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.println("enter size");
		size= sc.nextInt();
		
		int arr[]= new int[size];
		System.out.println("enter array elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		ArrayOperation obj = new ArrayOperation();
		obj.addArrayElement(arr);
	}

}
