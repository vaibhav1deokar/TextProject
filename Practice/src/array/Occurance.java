package array;

import java.util.Scanner;

public class Occurance {
	
	void occurance(int a[]) {
		for(int i = 0;i<a.length;i++) {
			int count =1;
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j] && a[i]!='\0') {
					count++;
					a[j] ='\0';
				}
			}
			if(a[i]!='\0') {
				System.out.println(a[i]+" "+count);
			}
		}
	}
	void occurance1(int a[]) {
		for(int i=0;i<a.length;i++) {
			int count = 1;
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]&&a[i]!='\0') {
					count++;
					a[j] = '\0';
				}
			}
			if(a[i]!='\0') {
				System.out.println(a[i]+" "+count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size");
		size = sc.nextInt();
		System.out.println("Enter array elements");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Occurance o = new Occurance();
		o.occurance(a);
		o.occurance1(a);

		sc.close();
	}

}
