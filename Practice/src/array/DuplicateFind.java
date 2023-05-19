package array;

import java.util.Arrays;

public class DuplicateFind {
	
	void findDuplicate(int[]a) {
		int j = 0;
		Arrays.sort(a);
		
		for(int i = 0; i<=a.length;i++) {
		for(j = i+1; j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
		}
//		System.out.println();
	}
	public static void main(String[] args) {
		
		int[]a = {1,5,2,1,9,8,8,7,4,9,5,2};
		
		DuplicateFind f = new DuplicateFind();
		f.findDuplicate(a);
	}
}
