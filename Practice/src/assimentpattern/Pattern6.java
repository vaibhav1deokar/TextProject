package assimentpattern;

public class Pattern6 {
	public static void main(String[] args) {

		int row = 7;

		for (int i = 1; i <= row; i++) {
			for(int k = row; k>=i;k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
//      1
//     1 2 
//    1 2 3
//   1 2 3 4
//  1 2 3 4 5
// 1 2 3 4 5 6
//1 2 3 4 5 6 7
