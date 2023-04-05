package assimentonwhile;

import java.util.Scanner;

public class FindPrimeNumberBet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st no.");
		int m =sc.nextInt();
		int pcn = sc.nextInt();
		System.out.println("Enter 2nd no.");

		int n =1;
		int dc = 1;
		while(n<=m) {
			while(pcn<=n/2) {
				if(n%pcn==0) {
					dc++;
					break;
				}
				pcn++;
			}
			if(dc==0 && n!=0) {
				System.out.println(n);
			}
			n++;
			sc.close();
		}
	}

}
