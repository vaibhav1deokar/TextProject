
public class ReversePyramid {
	public static void main(String[] args) {
		
		int n = 5;
		for (int i = 1; i <= n; i++) 
		{
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(" ");
			}
				for (int j = n; j >= i; j--)
				{
					System.out.print(" *");
				}
				System.out.println();
		}
	}

}
