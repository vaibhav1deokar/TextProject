package assimentpattern;

public class pattern5 {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println("*");
		}
		for (int m = n - 1; m >= 1; m--) {
			for (int k = 1; k <= n - m; k++) {
				System.out.print("");
			}
			for (int p = 1; p <= m; p++) {
				System.out.print(p);
			}
			for (int r = m - 1; r >= 1; r--) {
				System.out.print(r);
			}
			System.out.println("*");
		}
	}

}
