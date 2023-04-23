package array;

import java.util.Arrays;

public class Duplicate {
	
	void duplicateRemove(int ar[]) {
		int j = 0;
		int a[] = new int [ar.length/2];
		
		Arrays.sort(a);
		for(int i=0;i<ar.length;i++) {
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length];
		for(int i:a) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		int ar[] = {4,5,8,6,2,5,4,8,5,3,1,9,4,2,6,4,2};
		Duplicate d = new Duplicate();
		
		d.duplicateRemove(ar);
	}

}
