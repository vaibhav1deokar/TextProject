package arrays;

import java.util.Arrays;

public class Sort {
	
void acendingSort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Acending Array :"+Arrays.toString(arr));
		System.out.println("Second Highest :"+arr[arr.length-2]);
		System.out.println("Minimum:"+arr[0]);
		System.out.println("Second minimum:"+arr[1]);
	}
   void decendingSort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Decending Array :"+Arrays.toString(arr));
		System.out.println("Second Lowest :"+arr[arr.length-2]);
		System.out.println("Minimum:"+arr[arr.length-1]);
		System.out.println("Second maximum:"+arr[1]);
	}

	public static void main(String[] args) {
		
		int arr[]={20,34,5,56,13,2};
		System.out.println("Original Array :"+Arrays.toString(arr));
		int arr1[]={64,74,65,5,48,87};
		Sort obj=new Sort();
		obj.acendingSort(arr);
		System.out.println("..............................");
		System.out.println("original array :"+Arrays.toString(arr1));
		obj.decendingSort(arr1);

	}

}
