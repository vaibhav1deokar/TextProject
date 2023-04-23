package array;

import java.util.Scanner;

public class SquareArray {

	void array(int a[]) {
		int sqrt;
		for (int i : a) {
			sqrt = i * i;
			System.out.println("sqrt : " + sqrt);
		}
	}

	public static void main(String[] args) {

//		int a[]= {2,5,8,3,6,9,1,4,7};
		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter size array");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		SquareArray s = new SquareArray();
		s.array(a);
		
		sc.close();

	}

}
