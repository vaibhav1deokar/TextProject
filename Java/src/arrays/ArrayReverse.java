package arrays;

import java.util.Arrays;

public class ArrayReverse {
	
		
		void reverseArray(int arr[]){
			int l=arr.length;
			int mid=arr.length/2;
			
			for(int i=0;i<mid;i++){ //t i=0             t  i=1                  t  i=2                  f i=3
				int temp=arr[i]; // temp=10                 temp=20                temp=30
				arr[i]=arr[l-i-1];//arr[0]=arr[6-0-1]=60    arr[1]=arr[6-1-1]=50   arr[2]=arr[6-2-1]=40
				arr[l-i-1]=temp;//  arr[5]=10               arr[4]=20              arr[3]=30
			}
			System.out.println("Reverse Array: "+Arrays.toString(arr));
		}
		void reverseArray1(int ar[]){
			int l=ar.length;
			int mid=ar.length/2;
			
			for(int i=0;i<mid-1;i++){
				int temp=ar[i];
				ar[i]=ar[i+4];
				ar[i+4]=temp;
			}
			System.out.println(" "+Arrays.toString(ar));
		}
		public static void main(String[] args) {
			
			int arr[]={10,20,30,40,50,60};
			
			System.out.println("original Array: "+Arrays.toString(arr));
			ArrayReverse obj=new ArrayReverse();
			obj.reverseArray1(arr);
			obj.reverseArray(arr);
			
		}
	}


