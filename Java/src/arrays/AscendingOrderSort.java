package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AscendingOrderSort {

	void ascendingSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sort Array : " + Arrays.toString(arr));
		System.out.println();
		System.out.println("Second highst Array : "+arr[arr.length-2]);
		System.out.println();
		System.out.println("Minimum : "+arr[0]);
		System.out.println();
		System.out.println("Second minimum : "+arr[1]);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {20,34,5,56,13,2};
		
		System.out.println("Orignal array"+Arrays.toString(arr));
		
		AscendingOrderSort obj = new AscendingOrderSort();
		obj.ascendingSort(arr);

}
}