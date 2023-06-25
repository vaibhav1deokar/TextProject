package BasicJava;

import java.util.Arrays;

public class Occurance {
	
	
	void arryOccurance(int arr[]) {
//		System.out.println(Arrays.toString(arr));
		
		for (int i =0; i<arr.length;i++) {
			int count =1;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j] = 0;
				}
//				System.out.println(arr[i]+" "+count);
			}
			if(arr[i]!=0) {
			
			System.out.println(arr[i]+" "+count);
			}
		}
//		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,10,50,60,50,40,30};
		
		Occurance obj = new Occurance();
		obj.arryOccurance(arr);
	}

}
