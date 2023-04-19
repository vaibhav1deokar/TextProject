package arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	void removeDuplicateElement(int arr[]) {
		
		int j = 0;
		int a[] = new int[arr.length / 2];
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				a[j]=arr[i];
				j++;
			}
		}
		a[j]=arr[arr.length];
//		System.out.println(Arrays.toString(a));
		
		for(int i :a){
			System.out.println(i+" ");
		}

	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,10,20,30,40,50,50,40,30};
		
		RemoveDuplicate d = new RemoveDuplicate();
		d.removeDuplicateElement(arr);

		
	}

}
