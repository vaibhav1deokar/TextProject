package assimentpattern;

public class Pattern8 {
	public static void main(String[] args) {
		
		int n = 9;
		for (int i = 1; i <= n; i++) 
		{
			for (int k = 1; k <= n - i; k++) 
			{
				System.out.print(" ");
			}
				for (int j = 1; j <= i; j++)
				{
					System.out.print(j);
				}
				for(int l = i-1; l>=1;l--) {
					System.out.print(l);
				}
				System.out.println();
		}
	}

}
//        1
//       121
//      12321
//     1234321
//    123454321
//   12345654321
//  1234567654321
// 123456787654321
//12345678987654321