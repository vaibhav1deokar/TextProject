package ArrayAssiment;

import java.util.Arrays;
import java.util.Scanner;

public class TransverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];

		int trs[][] = new int[3][3];
		int i, j;

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[0].length; j++) {
				System.out.println("Enter element [" + i + "][" + j + "]");
				arr[i][j] = sc.nextInt();
				trs[j][i] = arr[i][j];
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(trs[i]));
		}
	}
}
